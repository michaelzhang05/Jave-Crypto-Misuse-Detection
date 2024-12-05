package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {
    private final a a;

    /* loaded from: classes.dex */
    interface a {
        boolean a(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    static class b implements a {
        private static final int a = ViewConfiguration.getTapTimeout();

        /* renamed from: b, reason: collision with root package name */
        private static final int f953b = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: c, reason: collision with root package name */
        private int f954c;

        /* renamed from: d, reason: collision with root package name */
        private int f955d;

        /* renamed from: e, reason: collision with root package name */
        private int f956e;

        /* renamed from: f, reason: collision with root package name */
        private int f957f;

        /* renamed from: g, reason: collision with root package name */
        private final Handler f958g;

        /* renamed from: h, reason: collision with root package name */
        final GestureDetector.OnGestureListener f959h;

        /* renamed from: i, reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f960i;

        /* renamed from: j, reason: collision with root package name */
        boolean f961j;

        /* renamed from: k, reason: collision with root package name */
        boolean f962k;
        private boolean l;
        private boolean m;
        private boolean n;
        MotionEvent o;
        private MotionEvent p;
        private boolean q;
        private float r;
        private float s;
        private float t;
        private float u;
        private boolean v;
        private VelocityTracker w;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f958g = new a(handler);
            } else {
                this.f958g = new a();
            }
            this.f959h = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            e(context);
        }

        private void b() {
            this.f958g.removeMessages(1);
            this.f958g.removeMessages(2);
            this.f958g.removeMessages(3);
            this.w.recycle();
            this.w = null;
            this.q = false;
            this.f961j = false;
            this.m = false;
            this.n = false;
            this.f962k = false;
            if (this.l) {
                this.l = false;
            }
        }

        private void c() {
            this.f958g.removeMessages(1);
            this.f958g.removeMessages(2);
            this.f958g.removeMessages(3);
            this.q = false;
            this.m = false;
            this.n = false;
            this.f962k = false;
            if (this.l) {
                this.l = false;
            }
        }

        private void e(Context context) {
            if (context != null) {
                if (this.f959h != null) {
                    this.v = true;
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                    this.f956e = viewConfiguration.getScaledMinimumFlingVelocity();
                    this.f957f = viewConfiguration.getScaledMaximumFlingVelocity();
                    this.f954c = scaledTouchSlop * scaledTouchSlop;
                    this.f955d = scaledDoubleTapSlop * scaledDoubleTapSlop;
                    return;
                }
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        private boolean f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.n || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f953b) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f955d;
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x021f  */
        @Override // androidx.core.view.GestureDetectorCompat.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 593
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.GestureDetectorCompat.b.a(android.view.MotionEvent):boolean");
        }

        void d() {
            this.f958g.removeMessages(3);
            this.f962k = false;
            this.l = true;
            this.f959h.onLongPress(this.o);
        }

        public void g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f960i = onDoubleTapListener;
        }

        /* loaded from: classes.dex */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    b bVar = b.this;
                    bVar.f959h.onShowPress(bVar.o);
                    return;
                }
                if (i2 == 2) {
                    b.this.d();
                    return;
                }
                if (i2 == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f960i;
                    if (onDoubleTapListener != null) {
                        if (!bVar2.f961j) {
                            onDoubleTapListener.onSingleTapConfirmed(bVar2.o);
                            return;
                        } else {
                            bVar2.f962k = true;
                            return;
                        }
                    }
                    return;
                }
                throw new RuntimeException("Unknown message " + message);
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* loaded from: classes.dex */
    static class c implements a {
        private final GestureDetector a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.a
        public boolean a(MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.a = new c(context, onGestureListener, handler);
        } else {
            this.a = new b(context, onGestureListener, handler);
        }
    }
}
