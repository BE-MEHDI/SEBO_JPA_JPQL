package mehdi_imad.dao;

import java.util.List;

import mehdi_imad.entities.Article;
import mehdi_imad.entities.Categorie;

public interface IArticleDao {
	public List<Article> getArticles(Long id);
	public Article getArticle(Long CodeArticle);
	public List<Categorie> getCategories();
	public Long getCatId(String cat);
	public String getCat(Long id);
	public Categorie getCategory(Long id);
}
