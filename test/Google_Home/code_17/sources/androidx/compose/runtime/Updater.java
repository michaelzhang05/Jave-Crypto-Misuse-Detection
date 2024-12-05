package androidx.compose.runtime;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m2500boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m2501constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2502equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && AbstractC3255y.d(composer, ((Updater) obj).m2512unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2503equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC3255y.d(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2504hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m2505initimpl(Composer composer, Function1 function1) {
        if (composer.getInserting()) {
            composer.apply(I.f8278a, new Updater$init$1(function1));
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m2506reconcileimpl(Composer composer, Function1 function1) {
        composer.apply(I.f8278a, new Updater$reconcile$1(function1));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m2507setimpl(Composer composer, int i8, InterfaceC1668n interfaceC1668n) {
        if (composer.getInserting() || !AbstractC3255y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            composer.apply(Integer.valueOf(i8), interfaceC1668n);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2509toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m2510updateimpl(Composer composer, int i8, InterfaceC1668n interfaceC1668n) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC3255y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i8), interfaceC1668n);
        }
    }

    public boolean equals(Object obj) {
        return m2502equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m2504hashCodeimpl(this.composer);
    }

    public String toString() {
        return m2509toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m2512unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m2508setimpl(Composer composer, V v8, InterfaceC1668n interfaceC1668n) {
        if (composer.getInserting() || !AbstractC3255y.d(composer.rememberedValue(), v8)) {
            composer.updateRememberedValue(v8);
            composer.apply(v8, interfaceC1668n);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m2511updateimpl(Composer composer, V v8, InterfaceC1668n interfaceC1668n) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC3255y.d(composer.rememberedValue(), v8)) {
            composer.updateRememberedValue(v8);
            if (inserting) {
                return;
            }
            composer.apply(v8, interfaceC1668n);
        }
    }
}
