package M3;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: M3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC1310e extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return O5.I.f8278a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3255y.i(addCallback, "$this$addCallback");
            AbstractActivityC1310e.this.n().C();
        }
    }

    private final void o() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y4.c.a(this);
    }

    public abstract P3.a n();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f6877a) {
            return;
        }
        o();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3255y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new a(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(boolean z8) {
        this.f6877a = z8;
    }
}
