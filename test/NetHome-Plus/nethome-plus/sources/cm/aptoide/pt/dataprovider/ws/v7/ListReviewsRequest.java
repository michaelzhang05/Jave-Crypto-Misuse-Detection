package cm.aptoide.pt.dataprovider.ws.v7;

import android.content.SharedPreferences;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.model.v7.ListReviews;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseRequestWithStore;
import cm.aptoide.pt.dataprovider.ws.v7.V7;
import cm.aptoide.pt.preferences.managed.ManagerPreferences;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListReviewsRequest extends V7<ListReviews, Body> {
    private static final int MAX_COMMENTS = 10;
    private static final int MAX_REVIEWS = 10;

    private ListReviewsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static ListReviewsRequest of(String str, String str2, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        return of(str, str2, 10, 10, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, str3);
    }

    public static ListReviewsRequest ofTopReviews(String str, String str2, int i2, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        return of(str, str2, i2, 0, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, str3);
    }

    public static ListReviewsRequest of(String str, String str2, int i2, int i3, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return of(str, str2, i2, i3, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.dataprovider.WebService
    public rx.e<ListReviews> loadDataFromNetwork(V7.Interfaces interfaces, boolean z) {
        return interfaces.listReviews((Body) this.body, true);
    }

    public static ListReviewsRequest of(String str, String str2, int i2, int i3, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        return new ListReviewsRequest(new Body(str, str2, i2, i3, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), storeCredentials, str3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* loaded from: classes.dex */
    public static class Body extends BaseBodyWithStore implements Endless {
        private String lang;
        private String languagesFilterSort;
        private Integer limit;
        private boolean mature;
        private int offset;
        private Order order;
        private String packageName;
        private boolean refresh;
        private Long reviewId;
        private Sort sort;
        private Long storeId;
        private String storeName;
        private Integer subLimit;

        /* loaded from: classes.dex */
        public enum Sort {
            latest,
            points
        }

        public Body(long j2, int i2, int i3, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
            this.storeId = Long.valueOf(j2);
            this.limit = Integer.valueOf(i2);
            this.subLimit = Integer.valueOf(i3);
            this.refresh = z;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBody
        public String getLang() {
            return this.lang;
        }

        public String getLanguagesFilterSort() {
            return this.languagesFilterSort;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public Order getOrder() {
            return this.order;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public Long getReviewId() {
            return this.reviewId;
        }

        public Sort getSort() {
            return this.sort;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBodyWithStore
        public Long getStoreId() {
            return this.storeId;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBodyWithStore
        public String getStoreName() {
            return this.storeName;
        }

        public Integer getSubLimit() {
            return this.subLimit;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBody
        public boolean isMature() {
            return this.mature;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBody
        public void setLang(String str) {
            this.lang = str;
        }

        public void setLanguagesFilterSort(String str) {
            this.languagesFilterSort = str;
        }

        public void setLimit(Integer num) {
            this.limit = num;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBody
        public void setMature(boolean z) {
            this.mature = z;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public void setOrder(Order order) {
            this.order = order;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        @Override // cm.aptoide.pt.dataprovider.ws.v7.BaseBody, cm.aptoide.pt.dataprovider.ws.RefreshBody
        public void setRefresh(boolean z) {
            this.refresh = z;
        }

        public void setReviewId(Long l) {
            this.reviewId = l;
        }

        public void setSort(Sort sort) {
            this.sort = sort;
        }

        public void setStoreId(Long l) {
            this.storeId = l;
        }

        public void setStoreName(String str) {
            this.storeName = str;
        }

        public void setSubLimit(Integer num) {
            this.subLimit = num;
        }

        public Body(String str, String str2, int i2, int i3, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials, String str3) {
            super(storeCredentials);
            this.packageName = str2;
            this.storeName = str;
            this.limit = Integer.valueOf(i2);
            this.subLimit = Integer.valueOf(i3);
            this.refresh = z;
            this.languagesFilterSort = str3;
        }
    }
}
