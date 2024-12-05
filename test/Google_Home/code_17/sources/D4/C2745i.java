package d4;

import O5.InterfaceC1355k;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import c4.C2043a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: d4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2745i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31188a;

    /* renamed from: b, reason: collision with root package name */
    private final W3.q f31189b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends Dialog {

        /* renamed from: a, reason: collision with root package name */
        private final W3.q f31190a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1355k f31191b;

        /* renamed from: d4.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0715a extends AbstractC3256z implements Function0 {
            C0715a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T3.d invoke() {
                T3.d c8 = T3.d.c(a.this.getLayoutInflater());
                AbstractC3255y.h(c8, "inflate(...)");
                return c8;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, W3.q uiCustomization) {
            super(context);
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(uiCustomization, "uiCustomization");
            this.f31190a = uiCustomization;
            this.f31191b = O5.l.b(new C0715a());
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final T3.d a() {
            return (T3.d) this.f31191b.getValue();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(a().getRoot());
            C2043a c2043a = C2043a.f15724a;
            CircularProgressIndicator progressBar = a().f10024b;
            AbstractC3255y.h(progressBar, "progressBar");
            c2043a.a(progressBar, this.f31190a);
        }
    }

    public C2745i(Context context, W3.q uiCustomization) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        this.f31188a = context;
        this.f31189b = uiCustomization;
    }

    public Dialog a() {
        return new a(this.f31188a, this.f31189b);
    }
}
