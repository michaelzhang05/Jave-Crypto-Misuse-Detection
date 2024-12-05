package o5;

import O5.I;
import a5.Q;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;

/* renamed from: o5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3681u {

    /* renamed from: a, reason: collision with root package name */
    private Q f36536a;

    /* renamed from: b, reason: collision with root package name */
    private String f36537b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36538c;

    /* renamed from: o5.u$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f36539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f36540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36542d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3681u f36543e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, String str2, C3681u c3681u, S5.d dVar) {
            super(2, dVar);
            this.f36540b = context;
            this.f36541c = str;
            this.f36542d = str2;
            this.f36543e = c3681u;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f36540b, this.f36541c, this.f36542d, this.f36543e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
        
            if (r3 != false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
        
            if (r3 != false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0122, code lost:
        
            if (r3 != false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: all -> 0x0053, JSONException -> 0x0056, TryCatch #1 {JSONException -> 0x0056, blocks: (B:5:0x0014, B:7:0x0029, B:9:0x002f, B:11:0x003c, B:13:0x004e, B:15:0x005c, B:17:0x0062, B:19:0x0088, B:24:0x0094, B:38:0x00a0, B:40:0x00ac), top: B:4:0x0014, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.C3681u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context, String str, a5.I i8) {
        this.f36538c = true;
        Q.f14058k.b(context);
        this.f36536a = null;
        if (str != null) {
            this.f36537b = str;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "fail");
        bundle.putString("loginSource", "google");
        if (i8 != null) {
            bundle.putString("responseCode", String.valueOf(i8.e()));
            if (i8.c() != null) {
                String c8 = i8.c();
                AbstractC3255y.f(c8);
                bundle.putString("exception", c8);
            }
        }
        new C3678r(context).b("login", bundle);
    }

    public final String b() {
        return this.f36537b;
    }

    public final Q c() {
        return this.f36536a;
    }

    public final com.google.android.gms.auth.api.signin.b d(Context context) {
        AbstractC3255y.i(context, "context");
        GoogleSignInOptions a8 = new GoogleSignInOptions.a(GoogleSignInOptions.f15842l).b().d("699621046070-qajra0rrsahiqmumvkg7fagujfd78tm8.apps.googleusercontent.com").a();
        AbstractC3255y.h(a8, "Builder(GoogleSignInOpti…om\")\n            .build()");
        com.google.android.gms.auth.api.signin.b a9 = com.google.android.gms.auth.api.signin.a.a(context, a8);
        AbstractC3255y.h(a9, "getClient(context, gso)");
        return a9;
    }

    public final boolean e() {
        return this.f36538c;
    }

    public final void f(Context context) {
        AbstractC3255y.i(context, "context");
        new C3681u().d(context).u();
    }

    public final Object g(String str, String str2, Context context, S5.d dVar) {
        this.f36536a = new Q();
        Object g8 = AbstractC3360i.g(C3347b0.b(), new a(context, str, str2, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    public final void i(boolean z8) {
        this.f36538c = z8;
    }

    public final void j(String str) {
        this.f36537b = str;
    }

    public final void k(Q q8) {
        this.f36536a = q8;
    }
}
