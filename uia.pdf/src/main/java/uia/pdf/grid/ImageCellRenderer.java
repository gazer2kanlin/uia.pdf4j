package uia.pdf.grid;

import java.awt.Point;

import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import uia.pdf.papers.Paper;

public class ImageCellRenderer implements CellRenderer {

    @Override
    public int paint(PDPageContentStream contentStream, Point topLeft, GridView view, ColumnModel cm, Object value, int row, int col) {
        PDImageXObject img = null;
        try {
            img = PDImageXObject.createFromFile(
                    (String) value,
                    view.getDoc().getDocument());

            Paper paper = view.getPaper();
            double wp = (double) Math.max(img.getWidth(), cm.getWidth()) / paper.getContentSize().width;
            double hp = (double) img.getHeight() / paper.getContentSize().height;
            double pct = 1.0 / Math.max(wp, hp);
            int w = (int) (img.getWidth() * pct);
            int h = (int) (img.getHeight() * pct);

            contentStream.drawImage(img, topLeft.x, topLeft.y - h, w, h);
            return h;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}
