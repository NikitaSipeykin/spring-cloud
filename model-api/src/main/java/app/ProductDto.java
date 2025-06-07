package app;

public class ProductDto {
  private Long id;
  private String title;

  public ProductDto(Long id, String title) {
    this.id = id;
    this.title = title;
  }

  public ProductDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
