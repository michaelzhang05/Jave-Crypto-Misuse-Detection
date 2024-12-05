package r5;

import H4.j;
import a5.C1639f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3943j0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.B f39018a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39019b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39020c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39021d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f39022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3943j0(View itemView, Z4.B b8) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        this.f39018a = b8;
        View findViewById = itemView.findViewById(R.id.tv_name_rollback_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.tv_name_rollback_item)");
        TextView textView = (TextView) findViewById;
        this.f39019b = textView;
        View findViewById2 = itemView.findViewById(R.id.tv_version_rollback_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…tv_version_rollback_item)");
        TextView textView2 = (TextView) findViewById2;
        this.f39020c = textView2;
        View findViewById3 = itemView.findViewById(R.id.tv_size_rollback_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_size_rollback_item)");
        TextView textView3 = (TextView) findViewById3;
        this.f39021d = textView3;
        View findViewById4 = itemView.findViewById(R.id.iv_icon_rollback_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.iv_icon_rollback_item)");
        this.f39022e = (ImageView) findViewById4;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3943j0.b(C3943j0.this, view);
            }
        });
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3943j0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f39018a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f39018a.a(bindingAdapterPosition);
        }
    }

    public final void c(C1639f item, Context context) {
        AbstractC3255y.i(item, "item");
        AbstractC3255y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3255y.h(packageManager, "context.packageManager");
            String J8 = item.J();
            AbstractC3255y.f(J8);
            this.f39022e.setImageDrawable(Q4.q.d(packageManager, J8, 0).applicationInfo.loadIcon(context.getPackageManager()));
        } catch (Exception e8) {
            this.f39022e.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_bag_disabled));
            e8.printStackTrace();
        }
        this.f39019b.setText(item.z());
        this.f39020c.setText(item.h0());
        this.f39021d.setText(item.a0());
    }
}
