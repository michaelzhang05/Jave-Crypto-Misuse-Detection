package t1;

import O5.I;
import a6.InterfaceC1668n;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4025c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC4023a f39550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC4024b f39551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39552c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f39553d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC4023a enumC4023a, EnumC4024b enumC4024b, int i8, String str) {
            super(1);
            this.f39550a = enumC4023a;
            this.f39551b = enumC4024b;
            this.f39552c = i8;
            this.f39553d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayButton invoke(Context context) {
            AbstractC3255y.i(context, "context");
            PayButton payButton = new PayButton(context);
            EnumC4023a enumC4023a = this.f39550a;
            EnumC4024b enumC4024b = this.f39551b;
            int i8 = this.f39552c;
            payButton.a(ButtonOptions.z().c(enumC4023a.b()).d(enumC4024b.b()).e(i8).b(this.f39553d).a());
            return payButton;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f39554a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f39555b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t1.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f39556a;

            a(Function0 function0) {
                this.f39556a = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39556a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, Function0 function0) {
            super(1);
            this.f39554a = z8;
            this.f39555b = function0;
        }

        public final void a(PayButton button) {
            float f8;
            AbstractC3255y.i(button, "button");
            boolean z8 = this.f39554a;
            Function0 function0 = this.f39555b;
            if (z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.5f;
            }
            button.setAlpha(f8);
            button.setEnabled(z8);
            if (z8) {
                button.setOnClickListener(new a(function0));
            } else {
                button.setOnClickListener(null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PayButton) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0882c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f39557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f39559c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC4023a f39560d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC4024b f39561e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f39562f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f39563g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f39564h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f39565i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0882c(Function0 function0, String str, Modifier modifier, EnumC4023a enumC4023a, EnumC4024b enumC4024b, float f8, boolean z8, int i8, int i9) {
            super(2);
            this.f39557a = function0;
            this.f39558b = str;
            this.f39559c = modifier;
            this.f39560d = enumC4023a;
            this.f39561e = enumC4024b;
            this.f39562f = f8;
            this.f39563g = z8;
            this.f39564h = i8;
            this.f39565i = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4025c.a(this.f39557a, this.f39558b, this.f39559c, this.f39560d, this.f39561e, this.f39562f, this.f39563g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39564h | 1), this.f39565i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156 A[LOOP:0: B:49:0x0154->B:50:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(kotlin.jvm.functions.Function0 r21, java.lang.String r22, androidx.compose.ui.Modifier r23, t1.EnumC4023a r24, t1.EnumC4024b r25, float r26, boolean r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC4025c.a(kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, t1.a, t1.b, float, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
