package r5;

import H4.j;
import a5.C1632D;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class E0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.o0 f38769a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38770b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.J f38771c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(W4.o0 binding, Context context, Z4.J j8, boolean z8) {
        super(binding.getRoot());
        AbstractC3255y.i(binding, "binding");
        AbstractC3255y.i(context, "context");
        this.f38769a = binding;
        this.f38770b = context;
        this.f38771c = j8;
        this.f38772d = z8;
        binding.f12445d.setOnClickListener(new View.OnClickListener() { // from class: r5.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E0.c(E0.this, view);
            }
        });
        binding.f12446e.setOnClickListener(new View.OnClickListener() { // from class: r5.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E0.d(E0.this, view);
            }
        });
        TextView textView = binding.f12447f;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        binding.f12446e.setTypeface(aVar.t());
        binding.f12448g.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(E0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38771c != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38771c.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(E0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38771c != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38771c.e(bindingAdapterPosition);
        }
    }

    public final void e(C1632D item) {
        AbstractC3255y.i(item, "item");
        com.squareup.picasso.s.h().l(item.c()).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29058B.f0(this.f38770b)).i(this.f38769a.f12443b);
        this.f38769a.f12447f.setText(item.d());
        if (!j6.n.t(item.e(), MBridgeConstans.ENDCARD_URL_TYPE_PL, false, 2, null)) {
            this.f38769a.f12448g.setText(item.e());
        }
        if (this.f38772d) {
            this.f38769a.f12446e.setText(this.f38770b.getString(R.string.cancel_registration));
            this.f38769a.f12446e.setBackground(ContextCompat.getDrawable(this.f38770b, R.drawable.ripple_cancel_button));
        } else {
            this.f38769a.f12446e.setText(this.f38770b.getString(R.string.pre_registration_title));
            this.f38769a.f12446e.setBackground(ContextCompat.getDrawable(this.f38770b, R.drawable.ripple_blue_primary_button));
        }
    }
}
