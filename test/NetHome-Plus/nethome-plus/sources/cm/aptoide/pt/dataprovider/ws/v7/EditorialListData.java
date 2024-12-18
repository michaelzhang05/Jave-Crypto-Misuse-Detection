package cm.aptoide.pt.dataprovider.ws.v7;

import cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse;
import cm.aptoide.pt.dataprovider.ws.v7.home.Appearance;

/* loaded from: classes.dex */
public class EditorialListData extends BaseV7EndlessDataListResponse {
    public Appearance appearance;
    public String caption;
    public String date;
    public String flair;
    public String icon;
    public String id;
    public String title;
    public String type;
    public String views;

    public Appearance getAppearance() {
        return this.appearance;
    }

    public String getCaption() {
        return this.caption;
    }

    public String getDate() {
        return this.date;
    }

    public String getFlair() {
        return this.flair;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getViews() {
        return this.views;
    }
}
