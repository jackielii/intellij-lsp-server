package com.github.jackielii.intellijlspserver

import org.eclipse.lsp4j.InitializeParams
import org.eclipse.lsp4j.InitializeResult
import org.eclipse.lsp4j.services.*
import java.io.Closeable
import java.util.concurrent.CompletableFuture

class IntellijLspServer : LanguageServer {
    override fun initialize(params: InitializeParams?): CompletableFuture<InitializeResult> {
        TODO("Not yet implemented")
    }

    override fun shutdown(): CompletableFuture<Any> {
        TODO("Not yet implemented")
    }

    override fun exit() {
        TODO("Not yet implemented")
    }

    override fun getTextDocumentService(): TextDocumentService {
        TODO("Not yet implemented")
    }

    override fun getWorkspaceService(): WorkspaceService {
        TODO("Not yet implemented")
    }
}