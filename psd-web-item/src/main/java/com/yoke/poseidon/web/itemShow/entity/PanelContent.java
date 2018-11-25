package com.yoke.poseidon.web.itemShow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yoke
 * @since 2018-11-22
 */
@TableName("db_panel_content")
public class PanelContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "panel_content_id", type = IdType.AUTO)
    private Integer panelContentId;

    private LocalDateTime created;

    private Integer panelId;

    private String picUrl;

    private String productId;

    private Integer sortOrder;

    private LocalDateTime updated;


    public Integer getPanelContentId() {
        return panelContentId;
    }

    public void setPanelContentId(Integer panelContentId) {
        this.panelContentId = panelContentId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public Integer getPanelId() {
        return panelId;
    }

    public void setPanelId(Integer panelId) {
        this.panelId = panelId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "PanelContentDto{" +
        "panelContentId=" + panelContentId +
        ", created=" + created +
        ", panelId=" + panelId +
        ", picUrl=" + picUrl +
        ", productId=" + productId +
        ", sortOrder=" + sortOrder +
        ", updated=" + updated +
        "}";
    }
}
