package io.sentry.android.core.internal.gestures;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.j5;
import io.sentry.x4;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryWindowCallback.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class h extends k {

    /* renamed from: g, reason: collision with root package name */
    private final Window.Callback f18683g;

    /* renamed from: h, reason: collision with root package name */
    private final g f18684h;

    /* renamed from: i, reason: collision with root package name */
    private final GestureDetectorCompat f18685i;

    /* renamed from: j, reason: collision with root package name */
    private final x4 f18686j;

    /* renamed from: k, reason: collision with root package name */
    private final b f18687k;

    /* compiled from: SentryWindowCallback.java */
    /* loaded from: classes2.dex */
    class a implements b {
        a() {
        }

        @Override // io.sentry.android.core.internal.gestures.h.b
        public /* synthetic */ MotionEvent a(MotionEvent motionEvent) {
            return i.a(this, motionEvent);
        }
    }

    /* compiled from: SentryWindowCallback.java */
    /* loaded from: classes2.dex */
    interface b {
        MotionEvent a(MotionEvent motionEvent);
    }

    public h(Window.Callback callback, Context context, g gVar, x4 x4Var) {
        this(callback, new GestureDetectorCompat(context, gVar), gVar, x4Var, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f18685i.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f18684h.n(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f18683g;
    }

    public void c() {
        this.f18684h.p(j5.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                b(this.f18687k.a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i2, Menu menu) {
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i2) {
        return super.onCreatePanelView(i2);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return super.onMenuItemSelected(i2, menuItem);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i2, View view, Menu menu) {
        return super.onPreparePanel(i2, view, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, x4 x4Var, b bVar) {
        super(callback);
        this.f18683g = callback;
        this.f18684h = gVar;
        this.f18686j = x4Var;
        this.f18685i = gestureDetectorCompat;
        this.f18687k = bVar;
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return super.onWindowStartingActionMode(callback, i2);
    }
}
