package r5;

import H4.j;
import Z4.InterfaceC1589c;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3926b extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1589c f38935a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f38936b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f38937c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f38938d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f38939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3926b(View itemView, InterfaceC1589c listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        this.f38935a = listener;
        View findViewById = itemView.findViewById(R.id.rl_app_file_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.rl_app_file_item)");
        this.f38936b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_type_app_file_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_type_app_file_item)");
        this.f38937c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_file_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_name_app_file_item)");
        this.f38938d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_size_app_file_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_size_app_file_item)");
        this.f38939e = (TextView) findViewById4;
        TextView textView = this.f38937c;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        this.f38938d.setTypeface(aVar.t());
        this.f38939e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3926b this$0, a5.r fileInfo, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(fileInfo, "$fileInfo");
        this$0.f38935a.a(fileInfo);
    }

    public final void b(final a5.r fileInfo) {
        AbstractC3255y.i(fileInfo, "fileInfo");
        this.f38936b.setOnClickListener(new View.OnClickListener() { // from class: r5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3926b.c(C3926b.this, fileInfo, view);
            }
        });
        String c8 = fileInfo.c();
        if (c8 != null) {
            TextView textView = this.f38937c;
            String substring = c8.substring(j6.n.X(c8, ".", 0, false, 6, null) + 1);
            AbstractC3255y.h(substring, "substring(...)");
            textView.setText(substring);
        }
        this.f38938d.setText(fileInfo.c());
        this.f38939e.setText(new Q4.g().c(fileInfo.e()));
    }
}
