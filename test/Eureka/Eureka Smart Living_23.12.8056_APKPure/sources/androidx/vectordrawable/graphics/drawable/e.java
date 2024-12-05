package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.n;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e extends i implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    private c f3693b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3694c;

    /* renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f3695d;

    /* renamed from: e, reason: collision with root package name */
    d f3696e;

    /* renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f3697f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f3698g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable.Callback f3699h;

    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            e.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
            e.this.scheduleSelf(runnable, j6);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            e.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(e.this.f3698g);
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i6)).b(e.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(e.this.f3698g);
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i6)).c(e.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f3702a;

        /* renamed from: b, reason: collision with root package name */
        j f3703b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f3704c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f3705d;

        /* renamed from: e, reason: collision with root package name */
        l.a f3706e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f3702a = cVar.f3702a;
                j jVar = cVar.f3703b;
                if (jVar != null) {
                    Drawable.ConstantState constantState = jVar.getConstantState();
                    this.f3703b = (j) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    j jVar2 = (j) this.f3703b.mutate();
                    this.f3703b = jVar2;
                    jVar2.setCallback(callback);
                    this.f3703b.setBounds(cVar.f3703b.getBounds());
                    this.f3703b.h(false);
                }
                ArrayList arrayList = cVar.f3705d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3705d = new ArrayList(size);
                    this.f3706e = new l.a(size);
                    for (int i6 = 0; i6 < size; i6++) {
                        Animator animator = (Animator) cVar.f3705d.get(i6);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f3706e.get(animator);
                        clone.setTarget(this.f3703b.d(str));
                        this.f3705d.add(clone);
                        this.f3706e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f3704c == null) {
                this.f3704c = new AnimatorSet();
            }
            this.f3704c.playTogether(this.f3705d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3702a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f3707a;

        public d(Drawable.ConstantState constantState) {
            this.f3707a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3707a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3707a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            e eVar = new e();
            Drawable newDrawable = this.f3707a.newDrawable();
            eVar.f3710a = newDrawable;
            newDrawable.setCallback(eVar.f3699h);
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            e eVar = new e();
            Drawable newDrawable = this.f3707a.newDrawable(resources);
            eVar.f3710a = newDrawable;
            newDrawable.setCallback(eVar.f3699h);
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            e eVar = new e();
            Drawable newDrawable = this.f3707a.newDrawable(resources, theme);
            eVar.f3710a = newDrawable;
            newDrawable.setCallback(eVar.f3699h);
            return eVar;
        }
    }

    e() {
        this(null, null, null);
    }

    public static e a(Context context, int i6) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            e eVar = new e(context);
            Drawable e6 = androidx.core.content.res.h.e(context.getResources(), i6, context.getTheme());
            eVar.f3710a = e6;
            e6.setCallback(eVar.f3699h);
            eVar.f3696e = new d(eVar.f3710a.getConstantState());
            return eVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i6);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e7) {
            Log.e("AnimatedVDCompat", "parser error", e7);
            return null;
        }
    }

    public static e b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        e eVar = new e(context);
        eVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return eVar;
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void e() {
        Animator.AnimatorListener animatorListener = this.f3697f;
        if (animatorListener != null) {
            this.f3693b.f3704c.removeListener(animatorListener);
            this.f3697f = null;
        }
    }

    private void f(String str, Animator animator) {
        animator.setTarget(this.f3693b.f3703b.d(str));
        c cVar = this.f3693b;
        if (cVar.f3705d == null) {
            cVar.f3705d = new ArrayList();
            this.f3693b.f3706e = new l.a();
        }
        this.f3693b.f3705d.add(animator);
        this.f3693b.f3706e.put(animator, str);
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        boolean unregisterAnimationCallback;
        unregisterAnimationCallback = animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
        return unregisterAnimationCallback;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public void c(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f3698g == null) {
            this.f3698g = new ArrayList();
        }
        if (this.f3698g.contains(bVar)) {
            return;
        }
        this.f3698g.add(bVar);
        if (this.f3697f == null) {
            this.f3697f = new b();
        }
        this.f3693b.f3704c.addListener(this.f3697f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3693b.f3703b.draw(canvas);
        if (this.f3693b.f3704c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean g(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f3698g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f3698g.size() == 0) {
            e();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3710a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3693b.f3703b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3693b.f3702a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3710a;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3693b.f3703b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3710a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f3710a.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3693b.f3703b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3693b.f3703b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.getOpacity() : this.f3693b.f3703b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3710a;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3693b.f3703b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f3710a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3693b.f3704c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.isStateful() : this.f3693b.f3703b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3693b.f3703b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.setLevel(i6) : this.f3693b.f3703b.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3710a;
        return drawable != null ? drawable.setState(iArr) : this.f3693b.f3703b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f3693b.f3703b.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z5);
        } else {
            this.f3693b.f3703b.setAutoMirrored(z5);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i6) {
        super.setChangingConfigurations(i6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i6, PorterDuff.Mode mode) {
        super.setColorFilter(i6, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z5) {
        super.setFilterBitmap(z5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f7) {
        super.setHotspot(f6, f7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i6, int i7, int i8, int i9) {
        super.setHotspotBounds(i6, i7, i8, i9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i6);
        } else {
            this.f3693b.f3703b.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f3693b.f3703b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f3693b.f3703b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f3693b.f3703b.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f3693b.f3704c.isStarted()) {
                return;
            }
            this.f3693b.f3704c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3693b.f3704c.end();
        }
    }

    private e(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3683e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        j b6 = j.b(resources, resourceId, theme);
                        b6.h(false);
                        b6.setCallback(this.f3699h);
                        j jVar = this.f3693b.f3703b;
                        if (jVar != null) {
                            jVar.setCallback(null);
                        }
                        this.f3693b.f3703b = b6;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f3684f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3694c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        f(string, g.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3693b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3710a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3693b.f3703b.setColorFilter(colorFilter);
        }
    }

    private e(Context context, c cVar, Resources resources) {
        this.f3695d = null;
        this.f3697f = null;
        this.f3698g = null;
        a aVar = new a();
        this.f3699h = aVar;
        this.f3694c = context;
        if (cVar != null) {
            this.f3693b = cVar;
        } else {
            this.f3693b = new c(context, cVar, aVar, resources);
        }
    }
}
