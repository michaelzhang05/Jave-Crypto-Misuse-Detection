package cm.aptoide.pt.dataprovider.ws.v2.aptwords;

import android.content.SharedPreferences;
import cm.aptoide.pt.dataprovider.BuildConfig;
import cm.aptoide.pt.dataprovider.WebService;
import cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse;
import cm.aptoide.pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.pt.dataprovider.ws.v2.aptwords.RegisterAdRefererRequest;
import cm.aptoide.pt.preferences.toolbox.ToolboxManager;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class Aptwords<U> extends WebService<Interfaces, U> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Interfaces {
        @FormUrlEncoded
        @POST("getAds")
        e<GetAdsResponse> getAds(@FieldMap HashMapNotNull<String, String> hashMapNotNull, @Header("X-Bypass-Cache") boolean z);

        @FormUrlEncoded
        @POST("registerAdReferer")
        e<RegisterAdRefererRequest.DefaultResponse> load(@FieldMap HashMapNotNull<String, String> hashMapNotNull);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Aptwords(OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences) {
        super(Interfaces.class, okHttpClient, factory, getHost(sharedPreferences));
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_APTWORDS_HOST);
        sb.append("/api/2/");
        return sb.toString();
    }
}
