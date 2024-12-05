package com.stripe.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.view.C0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class t0 extends ItemTouchHelper.SimpleCallback {

    /* renamed from: i, reason: collision with root package name */
    public static final a f27958i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f27959j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C0 f27960a;

    /* renamed from: b, reason: collision with root package name */
    private final b f27961b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f27962c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27963d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27964e;

    /* renamed from: f, reason: collision with root package name */
    private final ColorDrawable f27965f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27966g;

    /* renamed from: h, reason: collision with root package name */
    private final int f27967h;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final int a(float f8, int i8, int i9) {
            return Color.argb((int) (Color.alpha(i8) + ((Color.alpha(i9) - r0) * f8)), (int) (Color.red(i8) + ((Color.red(i9) - r1) * f8)), (int) (Color.green(i8) + ((Color.green(i9) - r2) * f8)), (int) (Color.blue(i8) + ((Color.blue(i9) - r8) * f8)));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(com.stripe.android.model.o oVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, C0 adapter, b listener) {
        super(0, 8);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(adapter, "adapter");
        AbstractC3159y.i(listener, "listener");
        this.f27960a = adapter;
        this.f27961b = listener;
        Drawable drawable = ContextCompat.getDrawable(context, j2.z.f33131S);
        AbstractC3159y.f(drawable);
        this.f27962c = drawable;
        int color = ContextCompat.getColor(context, j2.x.f33105h);
        this.f27963d = color;
        this.f27964e = ContextCompat.getColor(context, j2.x.f33106i);
        this.f27965f = new ColorDrawable(color);
        this.f27966g = drawable.getIntrinsicWidth() / 2;
        this.f27967h = context.getResources().getDimensionPixelSize(j2.y.f33112f);
    }

    private final void a(View view, int i8, float f8, Canvas canvas) {
        int a8;
        int top = view.getTop() + ((view.getHeight() - this.f27962c.getIntrinsicHeight()) / 2);
        int intrinsicHeight = this.f27962c.getIntrinsicHeight() + top;
        if (i8 > 0) {
            int left = view.getLeft() + this.f27967h;
            int intrinsicWidth = this.f27962c.getIntrinsicWidth() + left;
            if (i8 > intrinsicWidth) {
                this.f27962c.setBounds(left, top, intrinsicWidth, intrinsicHeight);
            } else {
                this.f27962c.setBounds(0, 0, 0, 0);
            }
            this.f27965f.setBounds(view.getLeft(), view.getTop(), view.getLeft() + i8 + this.f27966g, view.getBottom());
            ColorDrawable colorDrawable = this.f27965f;
            if (f8 <= 0.0f) {
                a8 = this.f27963d;
            } else if (f8 >= 1.0f) {
                a8 = this.f27964e;
            } else {
                a8 = f27958i.a(f8, this.f27963d, this.f27964e);
            }
            colorDrawable.setColor(a8);
        } else {
            this.f27962c.setBounds(0, 0, 0, 0);
            this.f27965f.setBounds(0, 0, 0, 0);
        }
        this.f27965f.draw(canvas);
        this.f27962c.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
    public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        AbstractC3159y.i(recyclerView, "recyclerView");
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C0.c.d) {
            return super.getSwipeDirs(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        return 0.5f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f8, float f9, int i8, boolean z8) {
        float f10;
        AbstractC3159y.i(canvas, "canvas");
        AbstractC3159y.i(recyclerView, "recyclerView");
        AbstractC3159y.i(viewHolder, "viewHolder");
        super.onChildDraw(canvas, recyclerView, viewHolder, f8, f9, i8, z8);
        if (viewHolder instanceof C0.c.d) {
            View itemView = viewHolder.itemView;
            AbstractC3159y.h(itemView, "itemView");
            float width = itemView.getWidth() * 0.25f;
            float width2 = itemView.getWidth() * 0.5f;
            if (f8 < width) {
                f10 = 0.0f;
            } else if (f8 >= width2) {
                f10 = 1.0f;
            } else {
                f10 = (f8 - width) / (width2 - width);
            }
            a(itemView, (int) f8, f10, canvas);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        AbstractC3159y.i(recyclerView, "recyclerView");
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(target, "target");
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        this.f27961b.a(this.f27960a.m(viewHolder.getBindingAdapterPosition()));
    }
}
