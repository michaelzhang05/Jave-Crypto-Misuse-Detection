package p4;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37758a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5617invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5617invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f37759a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f37759a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5618invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5618invoke() {
            this.f37759a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f37761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37762c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f37763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f37764e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f37765f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37766g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Integer num, boolean z8, long j8, Function0 function0, int i8, int i9) {
            super(2);
            this.f37760a = str;
            this.f37761b = num;
            this.f37762c = z8;
            this.f37763d = j8;
            this.f37764e = function0;
            this.f37765f = i8;
            this.f37766g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            u0.a(this.f37760a, this.f37761b, this.f37762c, this.f37763d, this.f37764e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37765f | 1), this.f37766g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B2.b f37767a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f37769c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0 f37770d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f37771e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f37772f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f37773a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t0 f37774b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1, t0 t0Var) {
                super(0);
                this.f37773a = function1;
                this.f37774b = t0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5619invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5619invoke() {
                this.f37773a.invoke(this.f37774b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B2.b bVar, long j8, List list, t0 t0Var, long j9, Function1 function1) {
            super(3);
            this.f37767a = bVar;
            this.f37768b = j8;
            this.f37769c = list;
            this.f37770d = t0Var;
            this.f37771e = j9;
            this.f37772f = function1;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(ColumnScope DropdownMenu, Composer composer, int i8) {
            AbstractC3255y.i(DropdownMenu, "$this$DropdownMenu");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072682231, i8, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown.<anonymous> (SingleChoiceDropdownUI.kt:48)");
            }
            TextKt.m1419Text4IGK_g(AbstractC4148a.a(this.f37767a, composer, 8), PaddingKt.m606paddingVpY3zN4(Modifier.Companion, Dp.m5183constructorimpl(13), Dp.m5183constructorimpl(5)), this.f37768b, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131064);
            List<t0> list = this.f37769c;
            t0 t0Var = this.f37770d;
            long j8 = this.f37771e;
            Function1 function1 = this.f37772f;
            for (t0 t0Var2 : list) {
                u0.a(AbstractC4148a.a(t0Var2.b(), composer, 8), t0Var2.getIcon(), AbstractC3255y.d(t0Var2, t0Var), j8, new a(function1, t0Var2), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B2.b f37776b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f37777c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f37778d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f37779e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f37780f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f37781g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f37782h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37783i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, B2.b bVar, t0 t0Var, List list, Function1 function1, long j8, long j9, Function0 function0, int i8) {
            super(2);
            this.f37775a = z8;
            this.f37776b = bVar;
            this.f37777c = t0Var;
            this.f37778d = list;
            this.f37779e = function1;
            this.f37780f = j8;
            this.f37781g = j9;
            this.f37782h = function0;
            this.f37783i = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            u0.b(this.f37775a, this.f37776b, this.f37777c, this.f37778d, this.f37779e, this.f37780f, this.f37781g, this.f37782h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37783i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r33, java.lang.Integer r34, boolean r35, long r36, kotlin.jvm.functions.Function0 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.u0.a(java.lang.String, java.lang.Integer, boolean, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z8, B2.b title, t0 t0Var, List choices, Function1 onChoiceSelected, long j8, long j9, Function0 onDismiss, Composer composer, int i8) {
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(choices, "choices");
        AbstractC3255y.i(onChoiceSelected, "onChoiceSelected");
        AbstractC3255y.i(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1512223510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1512223510, i8, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown (SingleChoiceDropdownUI.kt:43)");
        }
        AndroidMenu_androidKt.m1105DropdownMenu4kj_NE(z8, onDismiss, null, 0L, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -2072682231, true, new d(title, j8, choices, t0Var, j9, onChoiceSelected)), startRestartGroup, (i8 & 14) | 1572864 | ((i8 >> 18) & 112), 60);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(z8, title, t0Var, choices, onChoiceSelected, j8, j9, onDismiss, i8));
        }
    }
}
