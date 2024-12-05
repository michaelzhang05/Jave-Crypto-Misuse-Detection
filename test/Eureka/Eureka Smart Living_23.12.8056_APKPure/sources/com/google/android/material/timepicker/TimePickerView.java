package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    private final ClockFaceView A;
    private final MaterialButtonToggleGroup B;
    private final View.OnClickListener C;

    /* renamed from: x, reason: collision with root package name */
    private final Chip f5412x;

    /* renamed from: y, reason: collision with root package name */
    private final Chip f5413y;

    /* renamed from: z, reason: collision with root package name */
    private final ClockHandView f5414z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f5417a;

        c(GestureDetector gestureDetector) {
            this.f5417a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f5417a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    interface d {
    }

    /* loaded from: classes.dex */
    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(MaterialButtonToggleGroup materialButtonToggleGroup, int i6, boolean z5) {
    }

    private void x() {
        this.f5412x.setTag(m2.e.G, 12);
        this.f5413y.setTag(m2.e.G, 10);
        this.f5412x.setOnClickListener(this.C);
        this.f5413y.setOnClickListener(this.C);
        this.f5412x.setAccessibilityClassName("android.view.View");
        this.f5413y.setAccessibilityClassName("android.view.View");
    }

    private void y() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f5412x.setOnTouchListener(cVar);
        this.f5413y.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i6) {
        super.onVisibilityChanged(view, i6);
        if (view == this && i6 == 0) {
            this.f5413y.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.C = new a();
        LayoutInflater.from(context).inflate(m2.g.f7651j, this);
        this.A = (ClockFaceView) findViewById(m2.e.f7625k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(m2.e.f7628n);
        this.B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.g
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i7, boolean z5) {
                TimePickerView.this.w(materialButtonToggleGroup2, i7, z5);
            }
        });
        this.f5412x = (Chip) findViewById(m2.e.f7631q);
        this.f5413y = (Chip) findViewById(m2.e.f7629o);
        this.f5414z = (ClockHandView) findViewById(m2.e.f7626l);
        y();
        x();
    }
}
