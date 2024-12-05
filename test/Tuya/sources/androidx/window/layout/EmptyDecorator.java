package androidx.window.layout;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        AbstractC3159y.i(tracker, "tracker");
        return tracker;
    }
}
