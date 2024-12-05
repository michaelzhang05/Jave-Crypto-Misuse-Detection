package M3;

import B3.f;
import M3.InterfaceC1307b;
import a3.C1625g;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import b3.C1970d;
import com.stripe.android.model.o;
import com.stripe.android.model.r;
import e3.EnumC2791e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import u4.C4061a;

/* renamed from: M3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1308c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1307b f6862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1307b interfaceC1307b) {
            super(1);
            this.f6862a = interfaceC1307b;
        }

        public final void a(C1625g selectedLpm) {
            AbstractC3255y.i(selectedLpm, "selectedLpm");
            this.f6862a.d(new InterfaceC1307b.AbstractC0121b.C0122b(selectedLpm.d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1625g) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1307b f6863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f6864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1307b interfaceC1307b, State state) {
            super(1);
            this.f6863a = interfaceC1307b;
            this.f6864b = state;
        }

        public final void a(z3.c cVar) {
            this.f6863a.d(new InterfaceC1307b.AbstractC0121b.a(cVar, AbstractC1308c.b(this.f6864b).f()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z3.c) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0123c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1307b f6865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f6866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0123c(InterfaceC1307b interfaceC1307b, State state) {
            super(0);
            this.f6865a = interfaceC1307b;
            this.f6866b = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m33invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33invoke() {
            this.f6865a.d(new InterfaceC1307b.AbstractC0121b.c(AbstractC1308c.b(this.f6866b).f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1307b f6867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f6868b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6869c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1307b interfaceC1307b, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6867a = interfaceC1307b;
            this.f6868b = modifier;
            this.f6869c = i8;
            this.f6870d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1308c.a(this.f6867a, this.f6868b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6869c | 1), this.f6870d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(M3.InterfaceC1307b r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.AbstractC1308c.a(M3.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1307b.a b(State state) {
        return (InterfaceC1307b.a) state.getValue();
    }

    public static final com.stripe.android.model.q d(z3.c cVar, String paymentMethodCode) {
        AbstractC3255y.i(cVar, "<this>");
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        return e4.g.f31628a.h(cVar.a(), paymentMethodCode);
    }

    public static final com.stripe.android.model.p e(z3.c cVar, String paymentMethodCode, C1970d paymentMethodMetadata) {
        AbstractC3255y.i(cVar, "<this>");
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        return e4.g.f31628a.g(cVar.a(), paymentMethodCode, paymentMethodMetadata.d0(paymentMethodCode), paymentMethodMetadata.a(cVar.b()));
    }

    public static final com.stripe.android.model.r f(z3.c cVar, String paymentMethodCode) {
        AbstractC3255y.i(cVar, "<this>");
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        return e4.g.f31628a.i(cVar.a(), paymentMethodCode);
    }

    public static final B3.f g(z3.c cVar, C1625g paymentMethod, C1970d paymentMethodMetadata) {
        String str;
        AbstractC3255y.i(cVar, "<this>");
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        com.stripe.android.model.p e8 = e(cVar, paymentMethod.d(), paymentMethodMetadata);
        com.stripe.android.model.r f8 = f(cVar, paymentMethod.d());
        com.stripe.android.model.q d8 = d(cVar, paymentMethod.d());
        if (AbstractC3255y.d(paymentMethod.d(), o.p.f25587i.f25605a)) {
            r.b bVar = new r.b(null, null, cVar.b().b(), 3, null);
            EnumC2791e.a aVar = EnumC2791e.f31442m;
            C4061a c4061a = (C4061a) cVar.a().get(p4.G.Companion.f());
            if (c4061a != null) {
                str = c4061a.c();
            } else {
                str = null;
            }
            return new f.e.a(e8, aVar.b(str), cVar.b(), bVar, null, 16, null);
        }
        if (paymentMethodMetadata.Z(paymentMethod.d())) {
            return new f.b(paymentMethod.d(), e8.l(), paymentMethod.f(), paymentMethod.h(), paymentMethod.i(), paymentMethod.e());
        }
        return new f.e.b(paymentMethod.f(), paymentMethod.h(), paymentMethod.i(), paymentMethod.e(), e8, cVar.b(), f8, d8);
    }
}
