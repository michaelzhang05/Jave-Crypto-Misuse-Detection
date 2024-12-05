package androidx.compose.material;

import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final InterfaceC1669o transition;

    public FadeInFadeOutAnimationItem(T t8, InterfaceC1669o transition) {
        AbstractC3255y.i(transition, "transition");
        this.key = t8;
        this.transition = transition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, InterfaceC1669o interfaceC1669o, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i8 & 2) != 0) {
            interfaceC1669o = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, interfaceC1669o);
    }

    public final T component1() {
        return this.key;
    }

    public final InterfaceC1669o component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t8, InterfaceC1669o transition) {
        AbstractC3255y.i(transition, "transition");
        return new FadeInFadeOutAnimationItem<>(t8, transition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return AbstractC3255y.d(this.key, fadeInFadeOutAnimationItem.key) && AbstractC3255y.d(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final InterfaceC1669o getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t8 = this.key;
        return ((t8 == null ? 0 : t8.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
