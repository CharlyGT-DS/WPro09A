package solicitante;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/preview")
public class PreviewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        Anexos anexos = (Anexos) req.getSession()
                .getAttribute("anexos");

        if (anexos == null || anexos.getDocumentoParaPrevisualizar() == null) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        DocumentoSolicitante doc = anexos.getDocumentoParaPrevisualizar();

        resp.setContentType(doc.getTipoArchivo());
        resp.setHeader("Content-Disposition",
                "inline; filename=\"" + doc.getNombreArchivo() + "\"");
        resp.setContentLength(doc.getArchivo().length);

        try (OutputStream out = resp.getOutputStream()) {
            out.write(doc.getArchivo());
        }
    }
}
