package cm.aptoide.pt.dataprovider.model.v7;

/* loaded from: classes.dex */
public class ListAppCoinsCampaigns extends BaseV7EndlessDataListResponse<AppCoinsCampaign> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public boolean canEqual(Object obj) {
        return obj instanceof ListAppCoinsCampaigns;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListAppCoinsCampaigns) && ((ListAppCoinsCampaigns) obj).canEqual(this) && super.equals(obj);
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public int hashCode() {
        return 59 + super.hashCode();
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessDataListResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public String toString() {
        return "ListApps()";
    }
}