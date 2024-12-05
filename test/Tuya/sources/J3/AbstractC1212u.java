package J3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;

/* renamed from: J3.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1212u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.u$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5374a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5375b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3755g f5376c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5377d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5378e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5379f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, C3755g c3755g, boolean z8, String str2, boolean z9) {
            super(3);
            this.f5374a = i8;
            this.f5375b = str;
            this.f5376c = c3755g;
            this.f5377d = z8;
            this.f5378e = str2;
            this.f5379f = z9;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(ColumnScope RowButton, Composer composer, int i8) {
            AbstractC3159y.i(RowButton, "$this$RowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139491033, i8, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab.<anonymous> (NewPaymentMethodTab.kt:48)");
            }
            Alignment centerStart = Alignment.Companion.getCenterStart();
            Modifier.Companion companion = Modifier.Companion;
            AbstractC1216y.a(this.f5374a, this.f5375b, this.f5376c, this.f5377d, SizeKt.m654widthInVpY3zN4$default(SizeKt.m633height3ABfNKs(companion, z.f5499a.b()), 0.0f, Dp.m5178constructorimpl(36), 1, null), centerStart, composer, 221184 | (C3755g.f37939g << 6), 0);
            r.a(null, this.f5378e, AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, Dp.m5178constructorimpl(6), 0.0f, 0.0f, 13, null), this.f5379f, composer, 3072, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.u$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5382c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3755g f5383d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5384e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5385f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f5386g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f5387h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f5388i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f5389j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5390k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5391l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f8, int i8, String str, C3755g c3755g, String str2, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, int i9, int i10) {
            super(2);
            this.f5380a = f8;
            this.f5381b = i8;
            this.f5382c = str;
            this.f5383d = c3755g;
            this.f5384e = str2;
            this.f5385f = z8;
            this.f5386g = z9;
            this.f5387h = z10;
            this.f5388i = modifier;
            this.f5389j = function0;
            this.f5390k = i9;
            this.f5391l = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1212u.a(this.f5380a, this.f5381b, this.f5382c, this.f5383d, this.f5384e, this.f5385f, this.f5386g, this.f5387h, this.f5388i, this.f5389j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5390k | 1), this.f5391l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(float r22, int r23, java.lang.String r24, s4.C3755g r25, java.lang.String r26, boolean r27, boolean r28, boolean r29, androidx.compose.ui.Modifier r30, kotlin.jvm.functions.Function0 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.AbstractC1212u.a(float, int, java.lang.String, s4.g, java.lang.String, boolean, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
