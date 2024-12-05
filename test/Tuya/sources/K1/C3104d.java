package k1;

import L5.I;
import L5.t;
import X5.n;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import i1.C2768b;
import i6.AbstractC2825i;
import i6.M;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import org.json.JSONObject;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3104d implements InterfaceC3101a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f33318d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C2768b f33319a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f33320b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33321c;

    /* renamed from: k1.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: k1.d$b */
    /* loaded from: classes3.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f33322a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f33324c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f33325d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f33326e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, n nVar, n nVar2, P5.d dVar) {
            super(2, dVar);
            this.f33324c = map;
            this.f33325d = nVar;
            this.f33326e = nVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f33324c, this.f33325d, this.f33326e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f33322a;
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
                    URLConnection openConnection = C3104d.this.c().openConnection();
                    AbstractC3159y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f33324c.entrySet()) {
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
                            t8.f33761a = readLine;
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        n nVar = this.f33325d;
                        this.f33322a = 1;
                        if (nVar.invoke(jSONObject, this) == e8) {
                            return e8;
                        }
                    } else {
                        n nVar2 = this.f33326e;
                        String str = "Bad response code: " + responseCode;
                        this.f33322a = 2;
                        if (nVar2.invoke(str, this) == e8) {
                            return e8;
                        }
                    }
                }
            } catch (Exception e9) {
                n nVar3 = this.f33326e;
                String message = e9.getMessage();
                if (message == null) {
                    message = e9.toString();
                }
                this.f33322a = 3;
                if (nVar3.invoke(message, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public C3104d(C2768b appInfo, P5.g blockingDispatcher, String baseUrl) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(blockingDispatcher, "blockingDispatcher");
        AbstractC3159y.i(baseUrl, "baseUrl");
        this.f33319a = appInfo;
        this.f33320b = blockingDispatcher;
        this.f33321c = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f33321c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f33319a.b()).appendPath("settings").appendQueryParameter("build_version", this.f33319a.a().a()).appendQueryParameter("display_version", this.f33319a.a().d()).build().toString());
    }

    @Override // k1.InterfaceC3101a
    public Object a(Map map, n nVar, n nVar2, P5.d dVar) {
        Object g8 = AbstractC2825i.g(this.f33320b, new b(map, nVar, nVar2, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    public /* synthetic */ C3104d(C2768b c2768b, P5.g gVar, String str, int i8, AbstractC3151p abstractC3151p) {
        this(c2768b, gVar, (i8 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
