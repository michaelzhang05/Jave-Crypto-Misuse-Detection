package cm.aptoide.pt.dataprovider.ws.v7;

import android.content.SharedPreferences;
import cm.aptoide.pt.dataprovider.BuildConfig;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.model.v7.GetApp;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseRequestWithStore;
import cm.aptoide.pt.dataprovider.ws.v7.V7;
import cm.aptoide.pt.preferences.managed.ManagerPreferences;
import cm.aptoide.pt.preferences.toolbox.ToolboxManager;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetAppRequest extends V7<GetApp, Body> {
    private GetAppRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7.20240701/");
        return sb.toString();
    }

    public static GetAppRequest of(String str, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(str, str2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    public static GetAppRequest ofMd5(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(sharedPreferences, str), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    public static GetAppRequest ofUname(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(str, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* loaded from: classes.dex */
    public static class Body extends BaseBodyWithApp {
        private Long appId;

        @JsonProperty("apk_md5sum")
        private String md5;
        private Node nodes;
        private String packageName;

        @JsonProperty("store_name")
        private String storeName;

        @JsonProperty("package_uname")
        private String uname;

        public Body(Long l, String str, SharedPreferences sharedPreferences) {
            this(l.longValue(), sharedPreferences);
            this.nodes = new Node(l, str);
        }

        public Long getAppId() {
            return this.appId;
        }

        public String getMd5() {
            return this.md5;
        }

        public Node getNodes() {
            return this.nodes;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getStoreName() {
            return this.storeName;
        }

        public String getUname() {
            return this.uname;
        }

        public Body(Long l, String str, String str2, SharedPreferences sharedPreferences) {
            this(l.longValue(), sharedPreferences);
            this.storeName = str;
            this.nodes = new Node(l, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Node {
            private Groups groups;
            private Meta meta;
            private Versions versions;

            /* loaded from: classes.dex */
            private static class Groups {
                private Groups() {
                }
            }

            /* loaded from: classes.dex */
            private static class Meta {

                @JsonInclude(JsonInclude.Include.NON_NULL)
                private Long appId;

                private Meta() {
                }

                public Long getAppId() {
                    return this.appId;
                }

                public void setAppId(Long l) {
                    this.appId = l;
                }
            }

            /* loaded from: classes.dex */
            private static class Versions {

                @JsonInclude(JsonInclude.Include.NON_NULL)
                private String packageName;

                private Versions() {
                }

                public String getPackageName() {
                    return this.packageName;
                }

                public void setPackageName(String str) {
                    this.packageName = str;
                }
            }

            public Node(Long l, String str) {
                Meta meta = new Meta();
                this.meta = meta;
                meta.setAppId(l);
                Versions versions = new Versions();
                this.versions = versions;
                versions.setPackageName(str);
                this.groups = new Groups();
            }

            public Groups getGroups() {
                return this.groups;
            }

            public Meta getMeta() {
                return this.meta;
            }

            public Versions getVersions() {
                return this.versions;
            }

            public void setGroups(Groups groups) {
                this.groups = groups;
            }

            public void setMeta(Meta meta) {
                this.meta = meta;
            }

            public void setVersions(Versions versions) {
                this.versions = versions;
            }

            public Node(long j2) {
                this(Long.valueOf(j2), null);
            }

            public Node(String str) {
                this(null, str);
            }

            public Node() {
                this(null, null);
            }
        }

        public Body(String str, String str2, boolean z, SharedPreferences sharedPreferences) {
            this(str, Boolean.valueOf(z), sharedPreferences);
            this.storeName = str2;
            this.nodes = new Node();
        }

        public Body(String str, Boolean bool, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.packageName = str;
            this.nodes = new Node();
        }

        public Body(String str, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.uname = str;
            this.nodes = new Node();
        }

        public Body(SharedPreferences sharedPreferences, String str) {
            super(sharedPreferences);
            this.md5 = str;
            this.nodes = new Node();
        }

        public Body(long j2, SharedPreferences sharedPreferences) {
            super(sharedPreferences);
            this.appId = Long.valueOf(j2);
            this.nodes = new Node();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.dataprovider.WebService
    public rx.e<GetApp> loadDataFromNetwork(V7.Interfaces interfaces, boolean z) {
        return interfaces.getApp(z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body));
    }

    public static GetAppRequest of(String str, BodyInterceptor<BaseBody> bodyInterceptor, long j2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(Long.valueOf(j2), str, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    public static GetAppRequest of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetAppRequest(getHost(sharedPreferences), new Body(str, Boolean.valueOf(ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences)), sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    public static GetAppRequest of(long j2, String str, BaseRequestWithStore.StoreCredentials storeCredentials, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        Body body = new Body(Long.valueOf(j2), str, str2, sharedPreferences);
        body.setStoreUser(storeCredentials.getUsername());
        body.setStorePassSha1(storeCredentials.getPasswordSha1());
        return new GetAppRequest(getHost(sharedPreferences), body, bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }
}
