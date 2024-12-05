package com.uptodown.activities;

import a5.G;
import a5.K;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30375a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30376b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30377c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f30378d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f30379e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f30380f;

    /* renamed from: g, reason: collision with root package name */
    private final o6.w f30381g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f30382h;

    /* renamed from: i, reason: collision with root package name */
    private o6.w f30383i;

    /* renamed from: j, reason: collision with root package name */
    private o6.w f30384j;

    /* renamed from: k, reason: collision with root package name */
    private o6.w f30385k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30386a;

        public a(ArrayList replies) {
            AbstractC3255y.i(replies, "replies");
            this.f30386a = replies;
        }

        public final ArrayList a() {
            return this.f30386a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f30386a, ((a) obj).f30386a);
        }

        public int hashCode() {
            return this.f30386a.hashCode();
        }

        public String toString() {
            return "RepliesData(replies=" + this.f30386a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final a5.G f30387a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30388b;

        public b(a5.G reply, int i8) {
            AbstractC3255y.i(reply, "reply");
            this.f30387a = reply;
            this.f30388b = i8;
        }

        public final int a() {
            return this.f30388b;
        }

        public final a5.G b() {
            return this.f30387a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f30387a, bVar.f30387a) && this.f30388b == bVar.f30388b;
        }

        public int hashCode() {
            return (this.f30387a.hashCode() * 31) + this.f30388b;
        }

        public String toString() {
            return "ReplyLikedData(reply=" + this.f30387a + ", likedSuccess=" + this.f30388b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f30389a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30390b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30391c;

        /* renamed from: d, reason: collision with root package name */
        private final long f30392d;

        /* renamed from: e, reason: collision with root package name */
        private final String f30393e;

        public c(int i8, int i9, String text, long j8, String str) {
            AbstractC3255y.i(text, "text");
            this.f30389a = i8;
            this.f30390b = i9;
            this.f30391c = text;
            this.f30392d = j8;
            this.f30393e = str;
        }

        public final String a() {
            return this.f30393e;
        }

        public final int b() {
            return this.f30390b;
        }

        public final int c() {
            return this.f30389a;
        }

        public final String d() {
            return this.f30391c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30389a == cVar.f30389a && this.f30390b == cVar.f30390b && AbstractC3255y.d(this.f30391c, cVar.f30391c) && this.f30392d == cVar.f30392d && AbstractC3255y.d(this.f30393e, cVar.f30393e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f30389a * 31) + this.f30390b) * 31) + this.f30391c.hashCode()) * 31) + androidx.collection.a.a(this.f30392d)) * 31;
            String str = this.f30393e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SendReplyData(success=" + this.f30389a + ", statusCode=" + this.f30390b + ", text=" + this.f30391c + ", reviewID=" + this.f30392d + ", msg=" + this.f30393e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30396c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f30397d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, long j8, r rVar, S5.d dVar) {
            super(2, dVar);
            this.f30395b = context;
            this.f30396c = j8;
            this.f30397d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30395b, this.f30396c, this.f30397d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONArray jSONArray;
            T5.b.e();
            if (this.f30394a == 0) {
                O5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                a5.I U8 = new C3660F(this.f30395b).U(this.f30396c, 10, 0);
                if (!U8.b() && U8.d() != null) {
                    String d8 = U8.d();
                    AbstractC3255y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONArray = null;
                    }
                    if (i8 == 1 && jSONArray != null) {
                        arrayList = a5.G.f13969l.c(jSONArray);
                    }
                } else {
                    arrayList = new ArrayList();
                }
                this.f30397d.f30375a.setValue(new AbstractC3685y.c(new a(arrayList)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.G f30399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30400c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f30401d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a5.G g8, Context context, r rVar, S5.d dVar) {
            super(2, dVar);
            this.f30399b = g8;
            this.f30400c = context;
            this.f30401d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f30399b, this.f30400c, this.f30401d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30398a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                G.b bVar = a5.G.f13969l;
                a5.G g8 = this.f30399b;
                Context context = this.f30400c;
                this.f30398a = 1;
                obj = bVar.b(g8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f30401d.f30379e.setValue(new AbstractC3685y.c(new b(this.f30399b, ((Number) obj).intValue())));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30402a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.K f30403b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30404c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f30405d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a5.K k8, Context context, r rVar, S5.d dVar) {
            super(2, dVar);
            this.f30403b = k8;
            this.f30404c = context;
            this.f30405d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f30403b, this.f30404c, this.f30405d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30402a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                K.b bVar = a5.K.f14002o;
                a5.K k8 = this.f30403b;
                Context context = this.f30404c;
                this.f30402a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f30405d.f30377c.setValue(new AbstractC3685y.c(new K.c(this.f30403b, ((Number) obj).intValue())));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30408c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f30409d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f30410e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, String str, long j8, r rVar, S5.d dVar) {
            super(2, dVar);
            this.f30407b = context;
            this.f30408c = str;
            this.f30409d = j8;
            this.f30410e = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f30407b, this.f30408c, this.f30409d, this.f30410e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i8;
            T5.b.e();
            if (this.f30406a == 0) {
                O5.t.b(obj);
                a5.K.f14002o.f(this.f30407b, this.f30408c, String.valueOf(System.currentTimeMillis()));
                a5.I H02 = new C3660F(this.f30407b).H0(this.f30409d, this.f30408c);
                int i9 = 0;
                String str2 = null;
                if (!H02.b() && H02.d() != null) {
                    String d8 = H02.d();
                    AbstractC3255y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i9 = jSONObject.getInt("success");
                    }
                    if (i9 == 0) {
                        str2 = H02.g(jSONObject);
                    }
                    i8 = i9;
                    str = str2;
                } else {
                    str = null;
                    i8 = 0;
                }
                this.f30410e.f30381g.setValue(new AbstractC3685y.c(new c(i8, H02.e(), this.f30408c, this.f30409d, str)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public r() {
        AbstractC3685y.a aVar = AbstractC3685y.a.f36548a;
        o6.w a8 = AbstractC3700N.a(aVar);
        this.f30375a = a8;
        this.f30376b = a8;
        o6.w a9 = AbstractC3700N.a(aVar);
        this.f30377c = a9;
        this.f30378d = a9;
        o6.w a10 = AbstractC3700N.a(aVar);
        this.f30379e = a10;
        this.f30380f = a10;
        o6.w a11 = AbstractC3700N.a(aVar);
        this.f30381g = a11;
        this.f30382h = a11;
        this.f30383i = AbstractC3700N.a("");
        this.f30384j = AbstractC3700N.a("");
        this.f30385k = AbstractC3700N.a(null);
    }

    public final void e(Context context, long j8) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(context, j8, this, null), 2, null);
    }

    public final o6.w f() {
        return this.f30383i;
    }

    public final InterfaceC3698L g() {
        return this.f30376b;
    }

    public final InterfaceC3698L h() {
        return this.f30380f;
    }

    public final InterfaceC3698L i() {
        return this.f30378d;
    }

    public final o6.w j() {
        return this.f30385k;
    }

    public final InterfaceC3698L k() {
        return this.f30382h;
    }

    public final o6.w l() {
        return this.f30384j;
    }

    public final void m(Context context, a5.G reply) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(reply, "reply");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(reply, context, this, null), 2, null);
    }

    public final void n(Context context, a5.K review) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(review, "review");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new f(review, context, this, null), 2, null);
    }

    public final void o(Context context, String text, long j8) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(text, "text");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new g(context, text, j8, this, null), 2, null);
    }
}
