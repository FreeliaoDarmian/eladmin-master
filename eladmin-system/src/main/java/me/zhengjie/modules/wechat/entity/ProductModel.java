package me.zhengjie.modules.wechat.entity;

public class ProductModel {
    private Integer modelId;

    private Integer brandId;

    private String modelName;

    private Long accountPrice;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public Long getAccountPrice() {
        return accountPrice;
    }

    public void setAccountPrice(Long accountPrice) {
        this.accountPrice = accountPrice;
    }
}