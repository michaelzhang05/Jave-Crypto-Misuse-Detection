package B0;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f627a = new j() { // from class: B0.i
        @Override // B0.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
