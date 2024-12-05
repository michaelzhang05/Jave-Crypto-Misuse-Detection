package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3077h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC3077h onClose(Runnable runnable);

    InterfaceC3077h parallel();

    InterfaceC3077h sequential();

    Spliterator spliterator();

    InterfaceC3077h unordered();
}
