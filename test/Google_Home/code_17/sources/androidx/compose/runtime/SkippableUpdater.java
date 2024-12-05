package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ SkippableUpdater m2490boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: constructor-impl */
    public static <T> Composer m2491constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl */
    public static boolean m2492equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && AbstractC3255y.d(composer, ((SkippableUpdater) obj).m2497unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m2493equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC3255y.d(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m2494hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl */
    public static String m2495toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl */
    public static final void m2496updateimpl(Composer composer, Function1 function1) {
        composer.startReplaceableGroup(509942095);
        function1.invoke(Updater.m2500boximpl(Updater.m2501constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m2492equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m2494hashCodeimpl(this.composer);
    }

    public String toString() {
        return m2495toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ Composer m2497unboximpl() {
        return this.composer;
    }
}
