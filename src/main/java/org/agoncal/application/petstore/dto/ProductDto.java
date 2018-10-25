package org.agoncal.application.petstore.dto;

public class ProductDto
{
   private Long id;
   private int version;
   private String name;
   private String description;
   private CategoryDto category;

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public CategoryDto getCategory()
   {
      return this.category;
   }

   public void setCategory(final CategoryDto category)
   {
      this.category = category;
   }

   @Override
   public String toString()
   {
      return name;
   }
}
