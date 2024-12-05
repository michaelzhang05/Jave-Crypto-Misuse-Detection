package com.uptodown.activities;

import X4.G;
import X4.K;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29345a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29346b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29347c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f29348d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f29349e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f29350f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f29351g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f29352h;

    /* renamed from: i, reason: collision with root package name */
    private l6.v f29353i;

    /* renamed from: j, reason: collision with root package name */
    private l6.v f29354j;

    /* renamed from: k, reason: collision with root package name */
    private l6.v f29355k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29356a;

        public a(ArrayList replies) {
            AbstractC3159y.i(replies, "replies");
            this.f29356a = replies;
        }

        public final ArrayList a() {
            return this.f29356a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f29356a, ((a) obj).f29356a);
        }

        public int hashCode() {
            return this.f29356a.hashCode();
        }

        public String toString() {
            return "RepliesData(replies=" + this.f29356a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final X4.G f29357a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29358b;

        public b(X4.G reply, int i8) {
            AbstractC3159y.i(reply, "reply");
            this.f29357a = reply;
            this.f29358b = i8;
        }

        public final int a() {
            return this.f29358b;
        }

        public final X4.G b() {
            return this.f29357a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f29357a, bVar.f29357a) && this.f29358b == bVar.f29358b;
        }

        public int hashCode() {
            return (this.f29357a.hashCode() * 31) + this.f29358b;
        }

        public String toString() {
            return "ReplyLikedData(reply=" + this.f29357a + ", likedSuccess=" + this.f29358b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f29359a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29360b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29361c;

        /* renamed from: d, reason: collision with root package name */
        private final long f29362d;

        /* renamed from: e, reason: collision with root package name */
        private final String f29363e;

        public c(int i8, int i9, String text, long j8, String str) {
            AbstractC3159y.i(text, "text");
            this.f29359a = i8;
            this.f29360b = i9;
            this.f29361c = text;
            this.f29362d = j8;
            this.f29363e = str;
        }

        public final String a() {
            return this.f29363e;
        }

        public final int b() {
            return this.f29360b;
        }

        public final int c() {
            return this.f29359a;
        }

        public final String d() {
            return this.f29361c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29359a == cVar.f29359a && this.f29360b == cVar.f29360b && AbstractC3159y.d(this.f29361c, cVar.f29361c) && this.f29362d == cVar.f29362d && AbstractC3159y.d(this.f29363e, cVar.f29363e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f29359a * 31) + this.f29360b) * 31) + this.f29361c.hashCode()) * 31) + androidx.collection.a.a(this.f29362d)) * 31;
            String str = this.f29363e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SendReplyData(success=" + this.f29359a + ", statusCode=" + this.f29360b + ", text=" + this.f29361c + ", reviewID=" + this.f29362d + ", msg=" + this.f29363e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29365b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f29366c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f29367d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, long j8, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29365b = context;
            this.f29366c = j8;
            this.f29367d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29365b, this.f29366c, this.f29367d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONArray jSONArray;
            Q5.b.e();
            if (this.f29364a == 0) {
                L5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                X4.I U7 = new C3312F(this.f29365b).U(this.f29366c, 10, 0);
                if (!U7.b() && U7.d() != null) {
                    String d8 = U7.d();
                    AbstractC3159y.f(d8);
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
                        arrayList = X4.G.f12348l.c(jSONArray);
                    }
                } else {
                    arrayList = new ArrayList();
                }
                this.f29367d.f29345a.setValue(new AbstractC3337y.c(new a(arrayList)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.G f29369b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29370c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f29371d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(X4.G g8, Context context, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29369b = g8;
            this.f29370c = context;
            this.f29371d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29369b, this.f29370c, this.f29371d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29368a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                G.b bVar = X4.G.f12348l;
                X4.G g8 = this.f29369b;
                Context context = this.f29370c;
                this.f29368a = 1;
                obj = bVar.b(g8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29371d.f29349e.setValue(new AbstractC3337y.c(new b(this.f29369b, ((Number) obj).intValue())));
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29372a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.K f29373b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29374c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f29375d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(X4.K k8, Context context, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29373b = k8;
            this.f29374c = context;
            this.f29375d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f29373b, this.f29374c, this.f29375d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29372a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                K.b bVar = X4.K.f12381o;
                X4.K k8 = this.f29373b;
                Context context = this.f29374c;
                this.f29372a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29375d.f29347c.setValue(new AbstractC3337y.c(new K.c(this.f29373b, ((Number) obj).intValue())));
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29376a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29377b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29378c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f29379d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f29380e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, String str, long j8, s sVar, P5.d dVar) {
            super(2, dVar);
            this.f29377b = context;
            this.f29378c = str;
            this.f29379d = j8;
            this.f29380e = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f29377b, this.f29378c, this.f29379d, this.f29380e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i8;
            Q5.b.e();
            if (this.f29376a == 0) {
                L5.t.b(obj);
                X4.K.f12381o.f(this.f29377b, this.f29378c, String.valueOf(System.currentTimeMillis()));
                X4.I H02 = new C3312F(this.f29377b).H0(this.f29379d, this.f29378c);
                int i9 = 0;
                String str2 = null;
                if (!H02.b() && H02.d() != null) {
                    String d8 = H02.d();
                    AbstractC3159y.f(d8);
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
                this.f29380e.f29351g.setValue(new AbstractC3337y.c(new c(i8, H02.e(), this.f29378c, this.f29379d, str)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s() {
        AbstractC3337y.a aVar = AbstractC3337y.a.f34547a;
        l6.v a8 = AbstractC3351M.a(aVar);
        this.f29345a = a8;
        this.f29346b = a8;
        l6.v a9 = AbstractC3351M.a(aVar);
        this.f29347c = a9;
        this.f29348d = a9;
        l6.v a10 = AbstractC3351M.a(aVar);
        this.f29349e = a10;
        this.f29350f = a10;
        l6.v a11 = AbstractC3351M.a(aVar);
        this.f29351g = a11;
        this.f29352h = a11;
        this.f29353i = AbstractC3351M.a("");
        this.f29354j = AbstractC3351M.a("");
        this.f29355k = AbstractC3351M.a(null);
    }

    public final void e(Context context, long j8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, j8, this, null), 2, null);
    }

    public final l6.v f() {
        return this.f29353i;
    }

    public final InterfaceC3349K g() {
        return this.f29346b;
    }

    public final InterfaceC3349K h() {
        return this.f29350f;
    }

    public final InterfaceC3349K i() {
        return this.f29348d;
    }

    public final l6.v j() {
        return this.f29355k;
    }

    public final InterfaceC3349K k() {
        return this.f29352h;
    }

    public final l6.v l() {
        return this.f29354j;
    }

    public final void m(Context context, X4.G reply) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(reply, "reply");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(reply, context, this, null), 2, null);
    }

    public final void n(Context context, X4.K review) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(review, "review");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new f(review, context, this, null), 2, null);
    }

    public final void o(Context context, String text, long j8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(text, "text");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new g(context, text, j8, this, null), 2, null);
    }
}
