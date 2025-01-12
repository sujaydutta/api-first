/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.NewTask;
import org.openapitools.model.Task;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-11T22:44:30.088920-05:00[America/New_York]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "tasks", description = "the tasks API")
public interface TasksApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /tasks : Get all tasks
     * Retrieve a list of all tasks.
     *
     * @return A list of tasks. (status code 200)
     */
    @Operation(
        operationId = "tasksGet",
        summary = "Get all tasks",
        description = "Retrieve a list of all tasks.",
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of tasks.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Task.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/tasks",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Task>> tasksGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"id\" : \"12345\", \"completed\" : false, \"title\" : \"Buy groceries\" }, { \"id\" : \"12345\", \"completed\" : true, \"title\" : \"Cook Food\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /tasks : Create a new task
     * Add a new task to the list.
     *
     * @param newTask  (required)
     * @return Task created successfully. (status code 201)
     */
    @Operation(
        operationId = "tasksPost",
        summary = "Create a new task",
        description = "Add a new task to the list.",
        responses = {
            @ApiResponse(responseCode = "201", description = "Task created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/tasks",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Task> tasksPost(
        @Parameter(name = "NewTask", description = "", required = true) @Valid @RequestBody NewTask newTask
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"12345\", \"completed\" : false, \"title\" : \"Buy groceries\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /tasks/{taskId} : Delete a task by ID
     * Remove a specific task by its ID.
     *
     * @param taskId The ID of the task to delete. (required)
     * @return Task deleted successfully. (status code 204)
     */
    @Operation(
        operationId = "tasksTaskIdDelete",
        summary = "Delete a task by ID",
        description = "Remove a specific task by its ID.",
        responses = {
            @ApiResponse(responseCode = "204", description = "Task deleted successfully.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/tasks/{taskId}"
    )
    
    default ResponseEntity<Void> tasksTaskIdDelete(
        @Parameter(name = "taskId", description = "The ID of the task to delete.", required = true, in = ParameterIn.PATH) @PathVariable("taskId") String taskId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tasks/{taskId} : Get a task by ID
     * Retrieve details of a specific task by its ID.
     *
     * @param taskId The ID of the task to retrieve. (required)
     * @return Task details retrieved successfully. (status code 200)
     *         or Task not found. (status code 404)
     */
    @Operation(
        operationId = "tasksTaskIdGet",
        summary = "Get a task by ID",
        description = "Retrieve details of a specific task by its ID.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Task details retrieved successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            }),
            @ApiResponse(responseCode = "404", description = "Task not found.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/tasks/{taskId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Task> tasksTaskIdGet(
        @Parameter(name = "taskId", description = "The ID of the task to retrieve.", required = true, in = ParameterIn.PATH) @PathVariable("taskId") String taskId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"12345\", \"completed\" : false, \"title\" : \"Buy groceries\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /tasks/{taskId} : Update a task by ID
     * Update the details of a specific task by its ID.
     *
     * @param taskId The ID of the task to update. (required)
     * @param newTask  (required)
     * @return Task updated successfully. (status code 200)
     */
    @Operation(
        operationId = "tasksTaskIdPut",
        summary = "Update a task by ID",
        description = "Update the details of a specific task by its ID.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Task updated successfully.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/tasks/{taskId}",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> tasksTaskIdPut(
        @Parameter(name = "taskId", description = "The ID of the task to update.", required = true, in = ParameterIn.PATH) @PathVariable("taskId") String taskId,
        @Parameter(name = "NewTask", description = "", required = true) @Valid @RequestBody NewTask newTask
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
