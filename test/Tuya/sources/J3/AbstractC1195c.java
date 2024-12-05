package J3;

import J3.InterfaceC1194b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import com.stripe.android.model.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r4.C3688a;
import y3.AbstractC3991f;

/* renamed from: J3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1195c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1194b f5156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1194b interfaceC1194b) {
            super(1);
            this.f5156a = interfaceC1194b;
        }

        public final void a(X2.g selectedLpm) {
            AbstractC3159y.i(selectedLpm, "selectedLpm");
            this.f5156a.b(new InterfaceC1194b.AbstractC0096b.C0097b(selectedLpm.d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X2.g) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1194b f5157a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f5158b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1194b interfaceC1194b, State state) {
            super(1);
            this.f5157a = interfaceC1194b;
            this.f5158b = state;
        }

        public final void a(w3.c cVar) {
            this.f5157a.b(new InterfaceC1194b.AbstractC0096b.a(cVar, AbstractC1195c.b(this.f5158b).f()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w3.c) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0098c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1194b f5159a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f5160b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0098c(InterfaceC1194b interfaceC1194b, State state) {
            super(0);
            this.f5159a = interfaceC1194b;
            this.f5160b = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            this.f5159a.b(new InterfaceC1194b.AbstractC0096b.c(AbstractC1195c.b(this.f5160b).f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1194b f5161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f5162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5164d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1194b interfaceC1194b, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5161a = interfaceC1194b;
            this.f5162b = modifier;
            this.f5163c = i8;
            this.f5164d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1195c.a(this.f5161a, this.f5162b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5163c | 1), this.f5164d);
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
    public static final void a(J3.InterfaceC1194b r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.AbstractC1195c.a(J3.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1194b.a b(State state) {
        return (InterfaceC1194b.a) state.getValue();
    }

    public static final com.stripe.android.model.q d(w3.c cVar, String paymentMethodCode) {
        AbstractC3159y.i(cVar, "<this>");
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        return b4.g.f14622a.h(cVar.a(), paymentMethodCode);
    }

    public static final com.stripe.android.model.p e(w3.c cVar, String paymentMethodCode, Y2.d paymentMethodMetadata) {
        AbstractC3159y.i(cVar, "<this>");
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        return b4.g.f14622a.g(cVar.a(), paymentMethodCode, paymentMethodMetadata.d0(paymentMethodCode), paymentMethodMetadata.b(cVar.b()));
    }

    public static final com.stripe.android.model.r f(w3.c cVar, String paymentMethodCode) {
        AbstractC3159y.i(cVar, "<this>");
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        return b4.g.f14622a.i(cVar.a(), paymentMethodCode);
    }

    public static final AbstractC3991f g(w3.c cVar, X2.g paymentMethod, Y2.d paymentMethodMetadata) {
        String str;
        AbstractC3159y.i(cVar, "<this>");
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        com.stripe.android.model.p e8 = e(cVar, paymentMethod.d(), paymentMethodMetadata);
        com.stripe.android.model.r f8 = f(cVar, paymentMethod.d());
        com.stripe.android.model.q d8 = d(cVar, paymentMethod.d());
        if (AbstractC3159y.d(paymentMethod.d(), o.p.f24532i.f24550a)) {
            r.b bVar = new r.b(null, null, cVar.b().b(), 3, null);
            EnumC1870e.a aVar = EnumC1870e.f14436m;
            C3688a c3688a = (C3688a) cVar.a().get(m4.G.Companion.f());
            if (c3688a != null) {
                str = c3688a.c();
            } else {
                str = null;
            }
            return new AbstractC3991f.e.a(e8, aVar.b(str), cVar.b(), bVar, null, 16, null);
        }
        if (paymentMethodMetadata.Z(paymentMethod.d())) {
            return new AbstractC3991f.b(paymentMethod.d(), e8.j(), paymentMethod.f(), paymentMethod.h(), paymentMethod.i(), paymentMethod.e());
        }
        return new AbstractC3991f.e.b(paymentMethod.f(), paymentMethod.h(), paymentMethod.i(), paymentMethod.e(), e8, cVar.b(), f8, d8);
    }
}
