package m4;

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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import t4.AbstractC3794a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35732a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5613invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5613invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f35733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f35733a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5614invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5614invoke() {
            this.f35733a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35734a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f35735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35736c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f35737d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f35738e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35739f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35740g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Integer num, boolean z8, long j8, Function0 function0, int i8, int i9) {
            super(2);
            this.f35734a = str;
            this.f35735b = num;
            this.f35736c = z8;
            this.f35737d = j8;
            this.f35738e = function0;
            this.f35739f = i8;
            this.f35740g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            u0.a(this.f35734a, this.f35735b, this.f35736c, this.f35737d, this.f35738e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35739f | 1), this.f35740g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f35741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f35742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0 f35744d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f35745e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f35746f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f35747a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t0 f35748b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1, t0 t0Var) {
                super(0);
                this.f35747a = function1;
                this.f35748b = t0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5615invoke();
                return L5.I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5615invoke() {
                this.f35747a.invoke(this.f35748b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3983b interfaceC3983b, long j8, List list, t0 t0Var, long j9, Function1 function1) {
            super(3);
            this.f35741a = interfaceC3983b;
            this.f35742b = j8;
            this.f35743c = list;
            this.f35744d = t0Var;
            this.f35745e = j9;
            this.f35746f = function1;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(ColumnScope DropdownMenu, Composer composer, int i8) {
            AbstractC3159y.i(DropdownMenu, "$this$DropdownMenu");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072682231, i8, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown.<anonymous> (SingleChoiceDropdownUI.kt:48)");
            }
            TextKt.m1414Text4IGK_g(AbstractC3794a.a(this.f35741a, composer, 8), PaddingKt.m601paddingVpY3zN4(Modifier.Companion, Dp.m5178constructorimpl(13), Dp.m5178constructorimpl(5)), this.f35742b, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131064);
            List<t0> list = this.f35743c;
            t0 t0Var = this.f35744d;
            long j8 = this.f35745e;
            Function1 function1 = this.f35746f;
            for (t0 t0Var2 : list) {
                u0.a(AbstractC3794a.a(t0Var2.b(), composer, 8), t0Var2.getIcon(), AbstractC3159y.d(t0Var2, t0Var), j8, new a(function1, t0Var2), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35749a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f35750b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f35751c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f35752d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f35753e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f35754f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f35755g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f35756h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35757i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, InterfaceC3983b interfaceC3983b, t0 t0Var, List list, Function1 function1, long j8, long j9, Function0 function0, int i8) {
            super(2);
            this.f35749a = z8;
            this.f35750b = interfaceC3983b;
            this.f35751c = t0Var;
            this.f35752d = list;
            this.f35753e = function1;
            this.f35754f = j8;
            this.f35755g = j9;
            this.f35756h = function0;
            this.f35757i = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            u0.b(this.f35749a, this.f35750b, this.f35751c, this.f35752d, this.f35753e, this.f35754f, this.f35755g, this.f35756h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35757i | 1));
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
        throw new UnsupportedOperationException("Method not decompiled: m4.u0.a(java.lang.String, java.lang.Integer, boolean, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z8, InterfaceC3983b title, t0 t0Var, List choices, Function1 onChoiceSelected, long j8, long j9, Function0 onDismiss, Composer composer, int i8) {
        AbstractC3159y.i(title, "title");
        AbstractC3159y.i(choices, "choices");
        AbstractC3159y.i(onChoiceSelected, "onChoiceSelected");
        AbstractC3159y.i(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1512223510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1512223510, i8, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown (SingleChoiceDropdownUI.kt:43)");
        }
        AndroidMenu_androidKt.m1100DropdownMenu4kj_NE(z8, onDismiss, null, 0L, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -2072682231, true, new d(title, j8, choices, t0Var, j9, onChoiceSelected)), startRestartGroup, (i8 & 14) | 1572864 | ((i8 >> 18) & 112), 60);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(z8, title, t0Var, choices, onChoiceSelected, j8, j9, onDismiss, i8));
        }
    }
}
