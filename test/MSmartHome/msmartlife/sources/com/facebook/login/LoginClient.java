package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.d;
import com.facebook.internal.x;
import com.facebook.internal.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    LoginMethodHandler[] f9306f;

    /* renamed from: g, reason: collision with root package name */
    int f9307g;

    /* renamed from: h, reason: collision with root package name */
    Fragment f9308h;

    /* renamed from: i, reason: collision with root package name */
    c f9309i;

    /* renamed from: j, reason: collision with root package name */
    b f9310j;

    /* renamed from: k, reason: collision with root package name */
    boolean f9311k;
    Request l;
    Map<String, String> m;
    Map<String, String> n;
    private f o;

    /* loaded from: classes.dex */
    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private final d f9312f;

        /* renamed from: g, reason: collision with root package name */
        private Set<String> f9313g;

        /* renamed from: h, reason: collision with root package name */
        private final com.facebook.login.b f9314h;

        /* renamed from: i, reason: collision with root package name */
        private final String f9315i;

        /* renamed from: j, reason: collision with root package name */
        private final String f9316j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f9317k;
        private String l;
        private String m;
        private String n;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<Request> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i2) {
                return new Request[i2];
            }
        }

        /* synthetic */ Request(Parcel parcel, a aVar) {
            this(parcel);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String a() {
            return this.f9315i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            return this.f9316j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String c() {
            return this.m;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public com.facebook.login.b d() {
            return this.f9314h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String e() {
            return this.n;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String f() {
            return this.l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d g() {
            return this.f9312f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Set<String> h() {
            return this.f9313g;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean i() {
            Iterator<String> it = this.f9313g.iterator();
            while (it.hasNext()) {
                if (g.g(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean j() {
            return this.f9317k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k(Set<String> set) {
            y.i(set, "permissions");
            this.f9313g = set;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void l(boolean z) {
            this.f9317k = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            d dVar = this.f9312f;
            parcel.writeString(dVar != null ? dVar.name() : null);
            parcel.writeStringList(new ArrayList(this.f9313g));
            com.facebook.login.b bVar = this.f9314h;
            parcel.writeString(bVar != null ? bVar.name() : null);
            parcel.writeString(this.f9315i);
            parcel.writeString(this.f9316j);
            parcel.writeByte(this.f9317k ? (byte) 1 : (byte) 0);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Request(d dVar, Set<String> set, com.facebook.login.b bVar, String str, String str2, String str3) {
            this.f9317k = false;
            this.f9312f = dVar;
            this.f9313g = set == null ? new HashSet<>() : set;
            this.f9314h = bVar;
            this.m = str;
            this.f9315i = str2;
            this.f9316j = str3;
        }

        private Request(Parcel parcel) {
            this.f9317k = false;
            String readString = parcel.readString();
            this.f9312f = readString != null ? d.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f9313g = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f9314h = readString2 != null ? com.facebook.login.b.valueOf(readString2) : null;
            this.f9315i = parcel.readString();
            this.f9316j = parcel.readString();
            this.f9317k = parcel.readByte() != 0;
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
        }
    }

    /* loaded from: classes.dex */
    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        final b f9318f;

        /* renamed from: g, reason: collision with root package name */
        final AccessToken f9319g;

        /* renamed from: h, reason: collision with root package name */
        final String f9320h;

        /* renamed from: i, reason: collision with root package name */
        final String f9321i;

        /* renamed from: j, reason: collision with root package name */
        final Request f9322j;

        /* renamed from: k, reason: collision with root package name */
        public Map<String, String> f9323k;
        public Map<String, String> l;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<Result> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i2) {
                return new Result[i2];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            SUCCESS(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION),
            CANCEL("cancel"),
            ERROR("error");


            /* renamed from: j, reason: collision with root package name */
            private final String f9328j;

            b(String str) {
                this.f9328j = str;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public String d() {
                return this.f9328j;
            }
        }

        /* synthetic */ Result(Parcel parcel, a aVar) {
            this(parcel);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static Result a(Request request, String str) {
            return new Result(request, b.CANCEL, null, str, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static Result b(Request request, String str, String str2) {
            return c(request, str, str2, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static Result c(Request request, String str, String str2, String str3) {
            return new Result(request, b.ERROR, null, TextUtils.join(": ", x.c(str, str2)), str3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static Result d(Request request, AccessToken accessToken) {
            return new Result(request, b.SUCCESS, accessToken, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f9318f.name());
            parcel.writeParcelable(this.f9319g, i2);
            parcel.writeString(this.f9320h);
            parcel.writeString(this.f9321i);
            parcel.writeParcelable(this.f9322j, i2);
            x.s0(parcel, this.f9323k);
            x.s0(parcel, this.l);
        }

        Result(Request request, b bVar, AccessToken accessToken, String str, String str2) {
            y.i(bVar, "code");
            this.f9322j = request;
            this.f9319g = accessToken;
            this.f9320h = str;
            this.f9318f = bVar;
            this.f9321i = str2;
        }

        private Result(Parcel parcel) {
            this.f9318f = b.valueOf(parcel.readString());
            this.f9319g = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f9320h = parcel.readString();
            this.f9321i = parcel.readString();
            this.f9322j = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f9323k = x.f0(parcel);
            this.l = x.f0(parcel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<LoginClient> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i2) {
            return new LoginClient[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Result result);
    }

    public LoginClient(Fragment fragment) {
        this.f9307g = -1;
        this.f9308h = fragment;
    }

    private void a(String str, String str2, boolean z) {
        if (this.m == null) {
            this.m = new HashMap();
        }
        if (this.m.containsKey(str) && z) {
            str2 = this.m.get(str) + "," + str2;
        }
        this.m.put(str, str2);
    }

    private void h() {
        f(Result.b(this.l, "Login attempt failed.", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private f p() {
        f fVar = this.o;
        if (fVar == null || !fVar.a().equals(this.l.a())) {
            this.o = new f(i(), this.l.a());
        }
        return this.o;
    }

    public static int q() {
        return d.b.Login.d();
    }

    private void s(String str, Result result, Map<String, String> map) {
        t(str, result.f9318f.d(), result.f9320h, result.f9321i, map);
    }

    private void t(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.l == null) {
            p().h("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            p().b(this.l.b(), str, str2, str3, str4, map);
        }
    }

    private void w(Result result) {
        c cVar = this.f9309i;
        if (cVar != null) {
            cVar.a(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(c cVar) {
        this.f9309i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Request request) {
        if (n()) {
            return;
        }
        b(request);
    }

    boolean C() {
        LoginMethodHandler j2 = j();
        if (j2.i() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        boolean m = j2.m(this.l);
        if (m) {
            p().d(this.l.b(), j2.f());
        } else {
            p().c(this.l.b(), j2.f());
            a("not_tried", j2.f(), true);
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        int i2;
        if (this.f9307g >= 0) {
            t(j().f(), "skipped", null, null, j().f9329f);
        }
        do {
            if (this.f9306f != null && (i2 = this.f9307g) < r0.length - 1) {
                this.f9307g = i2 + 1;
            } else {
                if (this.l != null) {
                    h();
                    return;
                }
                return;
            }
        } while (!C());
    }

    void E(Result result) {
        Result b2;
        if (result.f9319g != null) {
            AccessToken g2 = AccessToken.g();
            AccessToken accessToken = result.f9319g;
            if (g2 != null && accessToken != null) {
                try {
                    if (g2.s().equals(accessToken.s())) {
                        b2 = Result.d(this.l, result.f9319g);
                        f(b2);
                        return;
                    }
                } catch (Exception e2) {
                    f(Result.b(this.l, "Caught exception", e2.getMessage()));
                    return;
                }
            }
            b2 = Result.b(this.l, "User logged in as different Facebook user.", null);
            f(b2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    void b(Request request) {
        if (request == null) {
            return;
        }
        if (this.l == null) {
            if (!AccessToken.t() || d()) {
                this.l = request;
                this.f9306f = m(request);
                D();
                return;
            }
            return;
        }
        throw new FacebookException("Attempted to authorize while a request is pending.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f9307g >= 0) {
            j().b();
        }
    }

    boolean d() {
        if (this.f9311k) {
            return true;
        }
        if (e("android.permission.INTERNET") != 0) {
            androidx.fragment.app.c i2 = i();
            f(Result.b(this.l, i2.getString(com.facebook.common.d.f9066c), i2.getString(com.facebook.common.d.f9065b)));
            return false;
        }
        this.f9311k = true;
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e(String str) {
        return i().checkCallingOrSelfPermission(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Result result) {
        LoginMethodHandler j2 = j();
        if (j2 != null) {
            s(j2.f(), result, j2.f9329f);
        }
        Map<String, String> map = this.m;
        if (map != null) {
            result.f9323k = map;
        }
        Map<String, String> map2 = this.n;
        if (map2 != null) {
            result.l = map2;
        }
        this.f9306f = null;
        this.f9307g = -1;
        this.l = null;
        this.m = null;
        w(result);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Result result) {
        if (result.f9319g != null && AccessToken.t()) {
            E(result);
        } else {
            f(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.c i() {
        return this.f9308h.getActivity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoginMethodHandler j() {
        int i2 = this.f9307g;
        if (i2 >= 0) {
            return this.f9306f[i2];
        }
        return null;
    }

    public Fragment l() {
        return this.f9308h;
    }

    protected LoginMethodHandler[] m(Request request) {
        ArrayList arrayList = new ArrayList();
        d g2 = request.g();
        if (g2.n()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (g2.o()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (g2.i()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (g2.d()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (g2.r()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (g2.f()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    boolean n() {
        return this.l != null && this.f9307g >= 0;
    }

    public Request r() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        b bVar = this.f9310j;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        b bVar = this.f9310j;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.f9306f, i2);
        parcel.writeInt(this.f9307g);
        parcel.writeParcelable(this.l, i2);
        x.s0(parcel, this.m);
        x.s0(parcel, this.n);
    }

    public boolean x(int i2, int i3, Intent intent) {
        if (this.l != null) {
            return j().j(i2, i3, intent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(b bVar) {
        this.f9310j = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(Fragment fragment) {
        if (this.f9308h == null) {
            this.f9308h = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    public LoginClient(Parcel parcel) {
        this.f9307g = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f9306f = new LoginMethodHandler[readParcelableArray.length];
        for (int i2 = 0; i2 < readParcelableArray.length; i2++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f9306f;
            loginMethodHandlerArr[i2] = (LoginMethodHandler) readParcelableArray[i2];
            loginMethodHandlerArr[i2].l(this);
        }
        this.f9307g = parcel.readInt();
        this.l = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.m = x.f0(parcel);
        this.n = x.f0(parcel);
    }
}
