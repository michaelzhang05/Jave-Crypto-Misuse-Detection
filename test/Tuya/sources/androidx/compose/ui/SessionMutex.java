package androidx.compose.ui;

import P5.d;
import X5.n;
import androidx.annotation.RestrictTo;
import i6.InterfaceC2855x0;
import i6.N;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@InternalComposeUiApi
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Session<T> {
        private final InterfaceC2855x0 job;
        private final T value;

        public Session(InterfaceC2855x0 interfaceC2855x0, T t8) {
            this.job = interfaceC2855x0;
            this.value = t8;
        }

        public final InterfaceC2855x0 getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m2610boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m2612constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2613equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && AbstractC3159y.d(atomicReference, ((SessionMutex) obj).m2619unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2614equalsimpl0(AtomicReference<Session<T>> atomicReference, AtomicReference<Session<T>> atomicReference2) {
        return AbstractC3159y.d(atomicReference, atomicReference2);
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m2615getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2616hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2617toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m2618withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, Function1 function1, n nVar, d dVar) {
        return N.e(new SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, nVar, null), dVar);
    }

    public boolean equals(Object obj) {
        return m2613equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m2616hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m2617toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m2619unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m2611constructorimpl() {
        return m2612constructorimpl(new AtomicReference(null));
    }
}
