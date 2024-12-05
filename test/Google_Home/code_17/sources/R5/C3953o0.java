package r5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3953o0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.t f39054a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39055b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3953o0(View itemView, String text, Z4.t tVar) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(text, "text");
        this.f39054a = tVar;
        View findViewById = itemView.findViewById(R.id.tv_system_apps_title);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.tv_system_apps_title)");
        TextView textView = (TextView) findViewById;
        this.f39055b = textView;
        this.f39056c = (ImageView) itemView.findViewById(R.id.iv_title_info);
        textView.setTypeface(H4.j.f3824g.t());
        textView.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3953o0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f39054a.a();
    }

    public final void b(boolean z8) {
        if (z8) {
            this.f39055b.setVisibility(0);
        } else {
            this.f39055b.setVisibility(8);
        }
        if (this.f39054a != null) {
            ImageView imageView = this.f39056c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f39056c;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: r5.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3953o0.c(C3953o0.this, view);
                    }
                });
                return;
            }
            return;
        }
        ImageView imageView3 = this.f39056c;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }
}
