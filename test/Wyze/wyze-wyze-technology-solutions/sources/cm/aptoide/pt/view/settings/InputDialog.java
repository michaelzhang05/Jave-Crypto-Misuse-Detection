package cm.aptoide.pt.view.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import cm.aptoide.pt.themes.ThemeManager;
import cm.aptoide.pt.view.dialog.EditableTextDialog;
import cm.aptoide.pt.view.rx.RxAlertDialog;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class InputDialog extends EditableTextDialog {

    /* loaded from: classes.dex */
    public static class Builder {
        private final RxAlertDialog.Builder builder;
        private int editTextId;
        private final LayoutInflater layoutInflater;
        private int viewRes;

        public Builder(Context context, ThemeManager themeManager) {
            this.builder = new RxAlertDialog.Builder(context, themeManager);
            this.layoutInflater = LayoutInflater.from(context);
        }

        public InputDialog build() {
            int i2 = this.viewRes;
            if (i2 != 0 && this.editTextId != 0) {
                View inflate = this.layoutInflater.inflate(i2, (ViewGroup) null, false);
                EditText editText = (EditText) inflate.findViewById(this.editTextId);
                this.builder.setView(inflate);
                return new InputDialog(this.builder.build(), editText);
            }
            throw new IllegalArgumentException("View and edit text resource ids must be provided");
        }

        public Builder setEditText(int i2) {
            this.editTextId = i2;
            return this;
        }

        public Builder setMessage(int i2) {
            this.builder.setMessage(i2);
            return this;
        }

        public Builder setNegativeButton(int i2) {
            this.builder.setNegativeButton(i2);
            return this;
        }

        public Builder setPositiveButton(int i2) {
            this.builder.setPositiveButton(i2);
            return this;
        }

        public Builder setView(int i2) {
            this.viewRes = i2;
            return this;
        }
    }

    public InputDialog(RxAlertDialog rxAlertDialog, EditText editText) {
        super(rxAlertDialog, editText);
    }

    @Override // cm.aptoide.pt.view.dialog.EditableTextDialog
    public void show() {
        super.show();
        setText(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void showWithInput(String str) {
        super.show();
        setText(str);
    }
}
