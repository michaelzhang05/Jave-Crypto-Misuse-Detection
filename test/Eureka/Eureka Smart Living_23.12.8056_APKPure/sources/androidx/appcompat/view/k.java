package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    final Window.Callback f504a;

    /* loaded from: classes.dex */
    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            boolean onSearchRequested;
            onSearchRequested = callback.onSearchRequested(searchEvent);
            return onSearchRequested;
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i6) {
            ActionMode onWindowStartingActionMode;
            onWindowStartingActionMode = callback.onWindowStartingActionMode(callback2, i6);
            return onWindowStartingActionMode;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i6) {
            callback.onProvideKeyboardShortcuts(list, menu, i6);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(Window.Callback callback, boolean z5) {
            callback.onPointerCaptureChanged(z5);
        }
    }

    public k(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f504a = callback;
    }

    public final Window.Callback a() {
        return this.f504a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f504a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f504a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f504a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f504a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f504a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f504a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f504a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f504a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f504a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        return this.f504a.onCreatePanelMenu(i6, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i6) {
        return this.f504a.onCreatePanelView(i6);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f504a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        return this.f504a.onMenuItemSelected(i6, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i6, Menu menu) {
        return this.f504a.onMenuOpened(i6, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        this.f504a.onPanelClosed(i6, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z5) {
        c.a(this.f504a, z5);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        return this.f504a.onPreparePanel(i6, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i6) {
        b.a(this.f504a, list, menu, i6);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f504a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f504a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z5) {
        this.f504a.onWindowFocusChanged(z5);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f504a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f504a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
        return a.b(this.f504a, callback, i6);
    }
}
