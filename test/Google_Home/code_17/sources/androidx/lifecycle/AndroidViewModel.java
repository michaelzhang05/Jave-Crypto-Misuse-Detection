package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        AbstractC3255y.i(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t8 = (T) this.application;
        AbstractC3255y.g(t8, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t8;
    }
}
