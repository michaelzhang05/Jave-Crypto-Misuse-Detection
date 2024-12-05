package n1;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l1.C3299b;
import l6.AbstractC3360i;
import l6.M;
import org.json.JSONObject;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3459d implements InterfaceC3456a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f35309d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C3299b f35310a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.g f35311b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35312c;

    /* renamed from: n1.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: n1.d$b */
    /* loaded from: classes4.dex */
    static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35313a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f35315c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f35316d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f35317e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, S5.d dVar) {
            super(2, dVar);
            this.f35315c = map;
            this.f35316d = interfaceC1668n;
            this.f35317e = interfaceC1668n2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f35315c, this.f35316d, this.f35317e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f35313a;
            try {
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        if (i8 == 3) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                    }
                } else {
                    t.b(obj);
                    URLConnection openConnection = C3459d.this.c().openConnection();
                    AbstractC3255y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f35315c.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        T t8 = new T();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            t8.f34162a = readLine;
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        InterfaceC1668n interfaceC1668n = this.f35316d;
                        this.f35313a = 1;
                        if (interfaceC1668n.invoke(jSONObject, this) == e8) {
                            return e8;
                        }
                    } else {
                        InterfaceC1668n interfaceC1668n2 = this.f35317e;
                        String str = "Bad response code: " + responseCode;
                        this.f35313a = 2;
                        if (interfaceC1668n2.invoke(str, this) == e8) {
                            return e8;
                        }
                    }
                }
            } catch (Exception e9) {
                InterfaceC1668n interfaceC1668n3 = this.f35317e;
                String message = e9.getMessage();
                if (message == null) {
                    message = e9.toString();
                }
                this.f35313a = 3;
                if (interfaceC1668n3.invoke(message, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3459d(C3299b appInfo, S5.g blockingDispatcher, String baseUrl) {
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(blockingDispatcher, "blockingDispatcher");
        AbstractC3255y.i(baseUrl, "baseUrl");
        this.f35310a = appInfo;
        this.f35311b = blockingDispatcher;
        this.f35312c = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f35312c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f35310a.b()).appendPath("settings").appendQueryParameter("build_version", this.f35310a.a().a()).appendQueryParameter("display_version", this.f35310a.a().f()).build().toString());
    }

    @Override // n1.InterfaceC3456a
    public Object a(Map map, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, S5.d dVar) {
        Object g8 = AbstractC3360i.g(this.f35311b, new b(map, interfaceC1668n, interfaceC1668n2, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public /* synthetic */ C3459d(C3299b c3299b, S5.g gVar, String str, int i8, AbstractC3247p abstractC3247p) {
        this(c3299b, gVar, (i8 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
