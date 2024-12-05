package q1;

import L5.I;
import X5.n;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: q1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3646c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC3644a f37228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC3645b f37229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37231d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC3644a enumC3644a, EnumC3645b enumC3645b, int i8, String str) {
            super(1);
            this.f37228a = enumC3644a;
            this.f37229b = enumC3645b;
            this.f37230c = i8;
            this.f37231d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayButton invoke(Context context) {
            AbstractC3159y.i(context, "context");
            PayButton payButton = new PayButton(context);
            EnumC3644a enumC3644a = this.f37228a;
            EnumC3645b enumC3645b = this.f37229b;
            int i8 = this.f37230c;
            payButton.a(ButtonOptions.I().c(enumC3644a.b()).d(enumC3645b.b()).e(i8).b(this.f37231d).a());
            return payButton;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f37233b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q1.c$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f37234a;

            a(Function0 function0) {
                this.f37234a = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37234a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, Function0 function0) {
            super(1);
            this.f37232a = z8;
            this.f37233b = function0;
        }

        public final void a(PayButton button) {
            float f8;
            AbstractC3159y.i(button, "button");
            boolean z8 = this.f37232a;
            Function0 function0 = this.f37233b;
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
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0849c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f37235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f37237c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC3644a f37238d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC3645b f37239e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f37240f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f37241g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37242h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37243i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0849c(Function0 function0, String str, Modifier modifier, EnumC3644a enumC3644a, EnumC3645b enumC3645b, float f8, boolean z8, int i8, int i9) {
            super(2);
            this.f37235a = function0;
            this.f37236b = str;
            this.f37237c = modifier;
            this.f37238d = enumC3644a;
            this.f37239e = enumC3645b;
            this.f37240f = f8;
            this.f37241g = z8;
            this.f37242h = i8;
            this.f37243i = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3646c.a(this.f37235a, this.f37236b, this.f37237c, this.f37238d, this.f37239e, this.f37240f, this.f37241g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37242h | 1), this.f37243i);
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
    public static final void a(kotlin.jvm.functions.Function0 r21, java.lang.String r22, androidx.compose.ui.Modifier r23, q1.EnumC3644a r24, q1.EnumC3645b r25, float r26, boolean r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.AbstractC3646c.a(kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, q1.a, q1.b, float, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
