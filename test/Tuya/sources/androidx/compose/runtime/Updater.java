package androidx.compose.runtime;

import L5.I;
import X5.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m2495boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m2496constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2497equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && AbstractC3159y.d(composer, ((Updater) obj).m2507unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2498equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC3159y.d(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2499hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m2500initimpl(Composer composer, Function1 function1) {
        if (composer.getInserting()) {
            composer.apply(I.f6487a, new Updater$init$1(function1));
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m2501reconcileimpl(Composer composer, Function1 function1) {
        composer.apply(I.f6487a, new Updater$reconcile$1(function1));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m2502setimpl(Composer composer, int i8, n nVar) {
        if (composer.getInserting() || !AbstractC3159y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            composer.apply(Integer.valueOf(i8), nVar);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2504toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m2505updateimpl(Composer composer, int i8, n nVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC3159y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i8), nVar);
        }
    }

    public boolean equals(Object obj) {
        return m2497equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m2499hashCodeimpl(this.composer);
    }

    public String toString() {
        return m2504toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m2507unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m2503setimpl(Composer composer, V v8, n nVar) {
        if (composer.getInserting() || !AbstractC3159y.d(composer.rememberedValue(), v8)) {
            composer.updateRememberedValue(v8);
            composer.apply(v8, nVar);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m2506updateimpl(Composer composer, V v8, n nVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC3159y.d(composer.rememberedValue(), v8)) {
            composer.updateRememberedValue(v8);
            if (inserting) {
                return;
            }
            composer.apply(v8, nVar);
        }
    }
}
