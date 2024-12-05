package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes2.dex */
public class k extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes2.dex */
    class a extends androidx.recyclerview.widget.j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, int i2, boolean z) {
        super(context, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i2);
        startSmoothScroll(aVar);
    }
}
