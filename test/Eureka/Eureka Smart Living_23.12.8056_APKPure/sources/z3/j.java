package z3;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f10008a = new j() { // from class: z3.i
        @Override // z3.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
