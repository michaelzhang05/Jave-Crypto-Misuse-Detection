package com.capacitorjs.plugins.camera;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* loaded from: classes.dex */
public class b extends com.google.android.material.bottomsheet.b {

    /* renamed from: t0, reason: collision with root package name */
    private c f4168t0;

    /* renamed from: u0, reason: collision with root package name */
    private InterfaceC0073b f4169u0;

    /* renamed from: v0, reason: collision with root package name */
    private List f4170v0;

    /* renamed from: w0, reason: collision with root package name */
    private String f4171w0;

    /* renamed from: x0, reason: collision with root package name */
    private BottomSheetBehavior.f f4172x0 = new a();

    /* loaded from: classes.dex */
    class a extends BottomSheetBehavior.f {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f6) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i6) {
            if (i6 == 5) {
                b.this.J1();
            }
        }
    }

    /* renamed from: com.capacitorjs.plugins.camera.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0073b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(int i6, View view) {
        c cVar = this.f4168t0;
        if (cVar != null) {
            cVar.a(i6);
        }
        J1();
    }

    @Override // androidx.appcompat.app.v, androidx.fragment.app.e
    public void U1(Dialog dialog, int i6) {
        super.U1(dialog, i6);
        List list = this.f4170v0;
        if (list == null || list.size() == 0) {
            return;
        }
        dialog.getWindow();
        float f6 = O().getDisplayMetrics().density;
        int i7 = (int) ((16.0f * f6) + 0.5f);
        int i8 = (int) ((12.0f * f6) + 0.5f);
        int i9 = (int) ((f6 * 8.0f) + 0.5f);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(u());
        LinearLayout linearLayout = new LinearLayout(u());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(i7, i7, i7, i7);
        TextView textView = new TextView(u());
        textView.setTextColor(Color.parseColor("#757575"));
        textView.setPadding(i9, i9, i9, i9);
        textView.setText(this.f4171w0);
        linearLayout.addView(textView);
        for (final int i10 = 0; i10 < this.f4170v0.size(); i10++) {
            TextView textView2 = new TextView(u());
            textView2.setTextColor(Color.parseColor("#000000"));
            textView2.setPadding(i8, i8, i8, i8);
            textView2.setText((CharSequence) this.f4170v0.get(i10));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.capacitorjs.plugins.camera.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.b2(i10, view);
                }
            });
            linearLayout.addView(textView2);
        }
        coordinatorLayout.addView(linearLayout.getRootView());
        dialog.setContentView(coordinatorLayout.getRootView());
        CoordinatorLayout.b e6 = ((CoordinatorLayout.e) ((View) coordinatorLayout.getParent()).getLayoutParams()).e();
        if (e6 == null || !(e6 instanceof BottomSheetBehavior)) {
            return;
        }
        ((BottomSheetBehavior) e6).Y(this.f4172x0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c2(List list, c cVar, InterfaceC0073b interfaceC0073b) {
        this.f4170v0 = list;
        this.f4168t0 = cVar;
        this.f4169u0 = interfaceC0073b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d2(String str) {
        this.f4171w0 = str;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        InterfaceC0073b interfaceC0073b = this.f4169u0;
        if (interfaceC0073b != null) {
            interfaceC0073b.a();
        }
    }
}
