package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
	@Column(name = "title", length = 30, unique = true)
	private String title;
	@Column(length = 50)
	private String description;
	// one to many association Category 1 ---->* Product
	// Category : one , parent , non owning(=inverse)
	@OneToMany(mappedBy = "category")
	private List<Blog> blogs = new ArrayList<>();// Tip : init the collection!

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String description) {
		super();
		this.title = categoryName;
		this.description = description;
	}

	public String getCategoryName() {
		return title;
	}

	public void setCategoryName(String categoryName) {
		this.title = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Blog> getProducts() {
		return blogs;
	}

	public void setProducts(List<Blog> blogss) {
		this.blogs = blogss;
	}

	@Override
	public String toString() {
		return "Category ID " + getId() + " [categoryName=" + title + ", description=" + description + "]";
	}

}
