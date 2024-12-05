package cm.aptoide.pt.dataprovider.model.v7;

import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class BaseV7EndlessDataListResponse<T> extends BaseV7EndlessResponse {

    @JsonProperty("datalist")
    private DataList<T> dataList;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public boolean canEqual(Object obj) {
        return obj instanceof BaseV7EndlessDataListResponse;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7EndlessDataListResponse)) {
            return false;
        }
        BaseV7EndlessDataListResponse baseV7EndlessDataListResponse = (BaseV7EndlessDataListResponse) obj;
        if (!baseV7EndlessDataListResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        DataList<T> dataList = getDataList();
        DataList<T> dataList2 = baseV7EndlessDataListResponse.getDataList();
        return dataList != null ? dataList.equals(dataList2) : dataList2 == null;
    }

    public DataList<T> getDataList() {
        return this.dataList;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse
    public int getNextSize() {
        if (hasData()) {
            return this.dataList.getNext();
        }
        return 0;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse
    public int getTotal() {
        if (hasData()) {
            return this.dataList.getTotal();
        }
        return 0;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse
    public boolean hasData() {
        DataList<T> dataList = this.dataList;
        return (dataList == null || dataList.getList() == null) ? false : true;
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse, cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public int hashCode() {
        int hashCode = super.hashCode() + 59;
        DataList<T> dataList = getDataList();
        return (hashCode * 59) + (dataList == null ? 43 : dataList.hashCode());
    }

    @Override // cm.aptoide.pt.dataprovider.model.v7.BaseV7Response
    public String toString() {
        return "BaseV7EndlessDataListResponse(dataList=" + getDataList() + ")";
    }
}
